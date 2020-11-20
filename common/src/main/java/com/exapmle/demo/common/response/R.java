package com.exapmle.demo.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class R<T> {

    private String code;

    private String description;

    private T data;

    public static R getInstance() {
        return getInstance(null);
    }

    public static R getInstance(Codeable codeable) {
        return getInstance(codeable, null);
    }

    public static <T> R getInstance(T data) {
        return getInstance(null, data);
    }

    public static <T> R getInstance(Codeable codeable, T data) {

        if (codeable == null) codeable = CommonCode.SUCCESS;
        return new R<T>().setData(data)
                .setCode(codeable.getCode())
                .setDescription(codeable.getDescription());
    }


}
