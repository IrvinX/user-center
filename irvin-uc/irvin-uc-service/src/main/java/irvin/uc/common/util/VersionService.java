package irvin.uc.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * @author irvin
 * @date Create in 下午3:56 2017/11/17
 * @description 临时 service，之后通过 Elasticsearch 替代
 */
@Service
public class VersionService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 获取 version
     *
     * @param dataId
     * @param clazz
     * @return
     */
    public long getVersion(String dataId, String clazz) {
        return mongoTemplate.count(new Query(Criteria.where("id").is(dataId)), clazz);
    }

    /**
     * 判断是否存在
     *
     * @param dataId
     * @param clazz
     * @return
     */
    public boolean versionExist(String dataId, long version, String clazz) {
        return 0 != mongoTemplate.count(new Query(Criteria.where("id").is(dataId).and("version").is(version)), clazz);
    }

}
