package com.sleepy.eschedule.exception;

/*
 * @author: Ziyu Zhou
 * @date: 2024/10/8 17:06
 * @Description: 全局异常处理基础接口类
 **/
public interface BaseErrorInfoInterface {
    /*
     * @Description: 获取消息码
     **/
    String getResultCode();
    /*
     * @Description: 获取返回信息
     **/
    String getResultMsg();
}
