package com.xxl.job.admin.supports;

import com.xxl.job.admin.core.exception.XxlJobException;
import com.xxl.job.core.biz.model.ReturnT;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = XxlJobException.class)
    @ResponseBody
    public ReturnT bizExceptionHandler(HttpServletRequest req, XxlJobException e){
        return new ReturnT(e.getMessage());
    }

    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ReturnT exceptionHandler(HttpServletRequest req, NullPointerException e){
        return new ReturnT(e.getMessage());
    }


    /**
     * 处理404的异常
     * @return
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    public ReturnT noHandlerFoundException(Exception e){

        return new ReturnT(e.getMessage());
    }


    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ReturnT exceptionHandler(HttpServletRequest req, Exception e){
        return new ReturnT(e.getMessage());
    }
}
