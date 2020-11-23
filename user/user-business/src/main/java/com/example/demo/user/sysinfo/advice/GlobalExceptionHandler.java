package com.example.demo.user.sysinfo.advice;


import com.exapmle.demo.common.response.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {


    @Value("${spring.application.name:not found}")
    private String applicationName;

    @Value("${spring.cloud.consul.discovery.instanceId:not found}")
    private String instanceId;

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Object notFountHandler(HttpServletRequest request, NoHandlerFoundException e) {

        String method = request.getMethod();
        String path = request.getRequestURI();


        return R.getInstance();
    }
}
