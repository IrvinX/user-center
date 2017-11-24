package irvin.api.bussiness.domain;

/**
 * @author irvin
 * @date Create in 下午1:45 2017/11/13
 * @description
 */
public class ResponseResult<T> {
    private boolean success = false;
    private String message;
    private T data;
    private int size = 0;
    private String errorCode;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ResponseResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
