package irvin.uc.service.basic;

import com.github.pagehelper.PageHelper;
import irvin.api.bussiness.domain.Event;
import irvin.api.bussiness.domain.ResponseResult;
import irvin.api.common.constant.UCConstant;
import irvin.api.domain.UcUserBasic;
import irvin.uc.common.amqp.service.sender.SenderService;
import irvin.uc.common.domain.UcUserBasicExample;
import irvin.uc.common.util.EventGenerator;
import irvin.uc.common.util.IDGenerator;
import irvin.uc.common.util.RestResultGenerator;
import irvin.uc.dao.UcUserBasicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author irvin
 * @date Create in 上午11:02 2017/11/13
 * @description
 */
@Service
public class UserService {

    @Autowired
    IDGenerator idGenerator;
    @Autowired
    RestResultGenerator restResultGenerator;
    @Autowired
    UcUserBasicMapper userBasicMapper;
    @Autowired
    EventGenerator eventGenerator;
    @Autowired
    RedisService redisService;
    @Autowired
    SenderService senderService;

    /**
     * Create user basic info
     *
     * @param ucUserBasic
     */
    public void createUserBasic(UcUserBasic ucUserBasic) {
        if (null == ucUserBasic.getId())
            ucUserBasic.setId(idGenerator.idGenerator());

        Event event = eventGenerator.generator(ucUserBasic, ucUserBasic.getId(), ucUserBasic.getVersion(), UCConstant.Opt.INSERT, "queue.uc.event");

        redisService.persistentDataInfo(ucUserBasic, event);
    }

    /**
     * Update user basic info
     *
     * @param ucUserBasic
     */
    public void updateUserBasic(UcUserBasic ucUserBasic) {
        userBasicMapper.updateByPrimaryKey(ucUserBasic);
    }

    /**
     * Find user basic info
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    public ResponseResult<List<UcUserBasic>> getUserBasic(Integer pageNo, Integer pageSize) {
        UcUserBasicExample example = new UcUserBasicExample();
        if (null != pageNo && null != pageSize)
            PageHelper.startPage(pageNo, pageSize);
        List<UcUserBasic> ucUserBasics = userBasicMapper.selectByExample(example);
        return restResultGenerator.genResult(ucUserBasics, ucUserBasics.size(), "Success!");
    }

    /**
     * Delete user basic info
     *
     * @param id
     */
    public void deleteUserBasic(String id) {
        userBasicMapper.deleteByPrimaryKey(id);
    }
}
