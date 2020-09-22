package com.tutor.aop;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class exception {
    @ExceptionHandler(Exception.class)
    public String exceptionHander(Exception e){

        System.out.println("--------------------------异常。。。。。。。。。。。。。。。。。。。。。");
        return "Exception";
    }
}
