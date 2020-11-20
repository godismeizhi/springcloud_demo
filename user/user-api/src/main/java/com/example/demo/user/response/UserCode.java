package com.example.demo.user.response;

import com.exapmle.demo.common.response.Codeable;
import com.exapmle.demo.common.response.CommonCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum UserCode implements Codeable {

    USER_NOT_EXAIT("1001", "用户不存在");


    private String code;

    private String description;

    UserCode(String code, String message) {
        this.code = code;
        this.description = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
