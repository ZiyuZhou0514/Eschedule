package com.sleepy.eschedule.exception;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @BelongsProject: eschedule
 * @BelongsPackage: com.sleepy.eschedule.exception
 * @Author: Ziyu Zhou
 * @CreateTime: 2024-10-08  17:27
 * @Description: 自定义数据传输
 */
@Getter
@Setter
@NoArgsConstructor
public class ResultResponse {
    private String code;
    private String message;

    /*
    相应结果
     */
    private Object result;

    public ResultResponse(BaseErrorInfoInterface errorInfo) {
        this.code=errorInfo.getResultCode();
        this.message= errorInfo.getResultMsg();
    }

    public static ResultResponse success() {
        return success(null);
    }

    public static ResultResponse success(Object data) {
        ResultResponse rb=new ResultResponse();
        rb.setCode(ExceptionEnum.SUCCESS.getResultCode());
        rb.setMessage(ExceptionEnum.SUCCESS.getResultMsg());
        rb.setResult(data);
        return rb;
    }

    public static ResultResponse error(BaseErrorInfoInterface errorInfo) {
        ResultResponse rb=new ResultResponse(errorInfo);
        rb.setCode(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setResult(null);
        return rb;
    }

    public static ResultResponse error(String code, String message) {
        ResultResponse rb=new ResultResponse();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    public static ResultResponse error(String message) {
        ResultResponse rb=new ResultResponse();
        rb.setCode("-1");
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    @Override
    public String toString() {
        return "{\"code\":\"" + code + "\",\"message\":\"" + message + "\",\"result\":" + result + "}";
    }
}
