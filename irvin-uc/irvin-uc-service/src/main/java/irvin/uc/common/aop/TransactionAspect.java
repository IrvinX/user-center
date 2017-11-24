package irvin.uc.common.aop;

import irvin.api.bussiness.domain.Event;
import irvin.uc.common.amqp.service.sender.SenderService;
import irvin.uc.common.util.VersionService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.spring.cloud.redis.services.RedisClientSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author irvin
 * @date Create in 下午1:37 2017/11/14
 * @description
 */
@Aspect
@Component
public class TransactionAspect {

    private static final Logger logger = LoggerFactory.getLogger(TransactionAspect.class);
    @Autowired
    private RedisClientSync redisClientSync;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private SenderService senderService;
    @Autowired
    private VersionService versionService;
    @Autowired
    private RedisClientTemplate redisClientTemplate;
    @Autowired
    private RollBack rollBack;

    /**
     * ~ 第一个 * 代表任意修饰符及任意返回值.
     * <p>
     * ~ 第二个 * 任意包名
     * <p>
     * ~ 第三个 * 代表任意方法.
     * <p>
     * ~ 第四个 * 定义在web包或者子包
     * <p>
     * ~ 第五个 * 任意方法
     * <p>
     * ~ .. 匹配任意数量的参数.
     */
    @Pointcut(value = "execution(public * irvin.uc.service.basic.RedisService.persistentDataInfo(..))")
    private void transaction() {
        logger.info("----> @Pointcut: Aop caught...");
    }

    /**
     * Aop
     *
     * @param point
     * @throws Throwable
     */
    @Around("transaction()")
    public void process(ProceedingJoinPoint point) throws Throwable {
        logger.info("----> @Around: executing target method...");
        // 访问目标方法的参数：
        Object[] args = point.getArgs();
        // 用改变后的参数执行目标方法
        point.proceed(args);
        List<Event> events = (List<Event>) args[1];
        if (events == null || events.isEmpty())
            return;

        String transactionID = events.get(0).getTransactionId();
        logger.info("----> @Around: transactionId:{}", transactionID);

        // 事务ID为空不处理
        if (null == transactionID || "".equals(transactionID))
            return;

        this.commit(events);
        /*
           释放锁,并释放所有数据
           结构1:{TransactionID，DataID(set)}
           结构2::{DataID，DataContent(Hash)}
           SETNX数据
         */
        redisClientSync.releaseLock(transactionID);
        logger.info("----> @Around finished...");
    }

    /**
     * 数据提交
     *
     * @param events events
     */
    private void commit(List<Event> events) {
        Set<String> collections = new HashSet<>();
        String transactionID = events.get(0).getTransactionId();

        // 从mongodb中取出数据，作为回滚日志存储到redis中
        if (rollBack.generateRollBackLog(events)) {
            logger.info(transactionID + "可以进行持久化操作");
            // id set
            try {
                events.forEach(event -> {
                    collections.add(event.getCollection());
                    String dataId = event.getDataId();
                    long version = event.getVersion();
                    if (event.getErrorCode() != 0) {
                        //TODO 异常处理
                        logger.warn("Event 出错,dataId: {}", dataId);
                        try {
                            throw new IllegalAccessException("Event 出错,dataId: {}" + event.getDataId());
                        } catch (IllegalAccessException e) {
                            rollBack.removeRollBackLog(collections, transactionID);
                            /*
                               释放锁,并释放所有数据<br>
                               结构1:{TransactionID，DataID(set)}
                               结构2::{DataID，DataContent(Hash)}
                               SETNX数据
                             */
                            redisClientSync.releaseLock(transactionID);
                            logger.error(transactionID + "事务执行失败");
                            e.printStackTrace();
                        }
                    }

                    String content = redisClientTemplate.hget(dataId, "content");
                    String collection = redisClientTemplate.hget(dataId, "collection");
                    /* 判断版本号是否错误 */
                    long targetVer = versionService.getVersion(dataId, collection);//取出的是目标版本号（当前版本号+1）
                    // 版本号小于当前版本号，说明版本号错误
                    if (targetVer - 1 > version) {
                        logger.warn("版本号错误！");
                        //TODO 异常处理
                        throw new IllegalArgumentException("版本号错误！");
                    }
                    /* 判断日志中该版本号是否存在，存在则删除，保证版本号唯一存在 */
                    boolean exist = versionService.versionExist(dataId, version, collection);

                    if (exist) {
                        mongoTemplate.remove(new Query(Criteria.where("id").is(dataId).and("version").is(version)), collection);
                    }

                    /* mongo 中记录数据日志 */
                    mongoTemplate.save(content, collection);

                    //日志记录后，发消息，由消息队列做后续事务
                    senderService.messageSendAndReceive(event, event.getDomain());

                });
                logger.info(transactionID + "事务执行成功");

            } catch (Exception e) {
                rollBack.removeRollBackLog(collections, transactionID);
                /*
                   释放锁,并释放所有数据<br>
                   结构1:{TransactionID，DataID(set)}
                   结构2::{DataID，DataContent(Hash)}
                   SETNX数据
                 */
                redisClientSync.releaseLock(transactionID);
                logger.error(transactionID + "事务执行失败");
                e.printStackTrace();
            }
        }
        rollBack.removeRollBackLog(collections, transactionID);
    }
}
