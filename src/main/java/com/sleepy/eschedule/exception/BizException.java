package com.sleepy.eschedule.exception;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @BelongsProject: eschedule
 * @BelongsPackage: com.sleepy.eschedule.exception
 * @Author: Ziyu Zhou
 * @CreateTime: 2024-10-08  17:14
 * @Description: 自定义异常类
 */
@Getter
@Setter
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    protected String code;
    protected String message;

    public BizException() {
        super();
    }
    public BizException(String message) {
        super(message);
        this.message = message;
    }
    public BizException(String code, String message) {
        super(code);
        this.code = code;
        this.message = message;
    }
    public BizException(String code, String message, Throwable cause) {
        super(code,cause);
        this.code = code;
        this.message = message;
    }
    public BizException(BaseErrorInfoInterface errorInfoInterface){
        super(errorInfoInterface.getResultCode());
        this.code=errorInfoInterface.getResultCode();
        this.message=errorInfoInterface.getResultMsg();
    }
    public BizException(BaseErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getResultCode(),cause);
        this.code=errorInfoInterface.getResultCode();
        this.message=errorInfoInterface.getResultMsg();
    }
    /*
    重载fillInStackTrace方法以提高JAVA性能，只要这个类不需要stack trace，可以直接返回this
    爬栈是抛异常开销大的主要原因之一
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
