package com.sleepy.eschedule.exception;

/*
 * @author: Ziyu Zhou 
 * @date: 2024/10/8 17:08
 * @Description: 异常枚举类   
 **/
public enum ExceptionEnum implements BaseErrorInfoInterface{
    SUCCESS("2000","成功！"),
    BODY_NOT_MATCH("4000","请求的数据格式不一致！"),
    SIGNATURE_NOT_MATCH("4001","请求的数字签名不匹配！"),
    NOT_FOUND("4004","未找到该资源！"),
    INTERNAL_SERVER_ERROR("5000","服务器内部错误"),
    SERVER_BUSY("5003","服务器正忙，请稍后再试！")
    ;
    /*
    错误信息&错误码
     */
    private String code;
    private String message;
    
    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getResultCode() {
        return code;
    }

    @Override
    public String getResultMsg() {
        return message;
    }
}
