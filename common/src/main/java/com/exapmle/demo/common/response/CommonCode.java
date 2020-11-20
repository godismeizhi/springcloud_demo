package com.exapmle.demo.common.response;

public enum CommonCode implements Codeable {

    SUCCESS("200", "成功"),
    NOT_FOUND("404", "资源无聊"),
    SYS_ERROR("500", "系统错误"),
    PARAM_ERROR("501", "参数错误");


    private String code;

    private String description;

    CommonCode(String code, String message) {
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
