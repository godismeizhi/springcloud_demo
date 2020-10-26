package com.example.demo.user.advice;

import com.example.demo.user.response.ErrorInfo;
import com.example.demo.user.response.RData;
import com.example.demo.user.response.RCode;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Value("${eureka.instance.instance-id:not found}")
    private String instanceId;

    @Autowired
    private RData.Builer builer;

    @Autowired
    private ErrorInfo.Builer errorInfoBuilder;


    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Object notFountHandler(HttpServletRequest request, NoHandlerFoundException e) {

        String method = request.getMethod();
        String path = request.getRequestURI();

        ErrorInfo errorInfo = errorInfoBuilder.setPath(path)
                .setMethod(method)
                .setApplicationName(applicationName)
                .setInstanceId(instanceId)
                .build();

        return builer.setCode(RCode.NOTFOUND)
                .setData(errorInfo)
                .bulid();

    }
}
