package irvin.uc.common.util;

import irvin.api.bussiness.domain.ResponseResult;
import org.springframework.stereotype.Component;

/**
 * @author irvin
 * @date Create in 下午1:48 2017/11/13
 * @description
 */
@Component
public class RestResultGenerator {

    /**
     * 生成响应成功(带正文)的结果
     *
     * @param data    结果正文
     * @param message 成功提示信息
     * @return ResponseResult
     */
    public <T> ResponseResult<T> genResult(T data, int size, String message) {
        ResponseResult<T> result = new ResponseResult();
        result.setSuccess(true);
        result.setData(data);
        result.setSize(size);
        result.setMessage(message);
        return result;
    }

}
