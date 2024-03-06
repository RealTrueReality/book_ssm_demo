package com.itheima.controller;

import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author TrueReality
 * @date 2022/12/30
 * @apiNotes
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    //处理其他异常
    public Result doException(Exception e) {
        System.out.println("Exception caught");
        return new Result(Code.UNKNOWN_FAILURE,null,"系统繁忙请稍后再试~~");

    }
    @ExceptionHandler(SystemException.class)
    //声明一个类为异常处理类
    public Result doSystemException(SystemException se) {
        //记录日志


        //发消息给运维


        //发送邮件给开发人
        return new Result(se.getCode(),null,se.getMessage());

    }
    @ExceptionHandler(BusinessException.class)
    //声明一个类为异常处理类
    public Result doBusinessException(BusinessException be) {

        return new Result(be.getCode(),null,be.getMessage());

    }
}
