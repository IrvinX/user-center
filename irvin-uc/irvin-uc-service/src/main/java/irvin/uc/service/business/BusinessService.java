package irvin.uc.service.business;

import irvin.api.domain.UcUserBasic;
import irvin.uc.service.basic.UserService;
import org.spring.cloud.redis.repositories.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author irvin
 * @date Create in 上午10:42 2017/11/15
 * @description
 */
@Service
public class BusinessService {
    @Autowired
    UserService userService;
    @Autowired
    RedisClientTemplate redisClientTemplate;

}
