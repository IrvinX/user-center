package irvin.uc.common.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author irvin
 * @date Create in 上午11:08 2017/11/13
 * @description
 */
@Component
public class IDGenerator {

    /**
     * 生成 32 位 UUID
     *
     * @return
     */
    public String idGenerator() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
