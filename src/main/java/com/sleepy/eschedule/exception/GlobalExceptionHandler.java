package com.sleepy.eschedule.exception;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsProject: eschedule
 * @BelongsPackage: com.sleepy.eschedule.exception
 * @Author: Ziyu Zhou
 * @CreateTime: 2024-10-08  17:38
 * @Description: 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /*
     * @author: Ziyu Zhou
     * @date: 2024/10/8 17:45
     * @param: [req, e]
     * @return: ResultResponse
     * @Description: 处理自定义异常
     **/
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ResultResponse bizExceptionHandler(HttpServletRequest req,BizException e){
        logger.error("发生业务异常！原因是：{}", e.getMessage());
        return ResultResponse.error(e.getCode(),e.getMessage());
    }
    /*
     * @author: Ziyu Zhou
     * @date: 2024/10/8 17:51
     * @param: [req, e]
     * @return: ResultResponse
     * @Description: 处理空指针
     **/
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultResponse exceptionHandler(HttpServletRequest req,NullPointerException e){
        logger.error("发生空指针异常！原因是：{}", e);
        return ResultResponse.error(ExceptionEnum.BODY_NOT_MATCH);
    }
    /*
     * @author: Ziyu Zhou
     * @date:  17:56
     * @param: [req, e]
     * @return: ResultResponse
     * @Description: 处理其他异常
     **/
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultResponse exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:",e);
        return ResultResponse.error(ExceptionEnum.INTERNAL_SERVER_ERROR);
    }
}
