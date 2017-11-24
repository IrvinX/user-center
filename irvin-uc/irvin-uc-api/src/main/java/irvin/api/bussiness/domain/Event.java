package irvin.api.bussiness.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author irvin
 * @date Create in 上午10:14 2017/11/14
 * @description 消息对象，通过消息中 id 取出数据进行持久化
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 错误编码
     */
    private int errorCode = 0;

    /**
     * 数据操作类型
     */
    private int action = -1;

    /**
     * 数据对应数据类型 class_name
     */
    private String collection;

    /**
     * 事务 id
     */
    private String transactionId;

    /**
     * 数据 id
     */
    private String dataId;

    /**
     * 数据版本号
     */
    private long version;

    /**
     * 所属领域
     * 这里先存 消息队列名
     * 为了在日志存储完后，发消息，发消息时，通过该字段确定发送到的目标队列
     */
    private String domain;
}
