package com.example.demo.user.response;

import com.exapmle.demo.common.response.RCode;

public class UserCode extends RCode {

    public static final String USER_NOT_EXAIT = "1001";

    static {
        infos.put(USER_NOT_EXAIT, "用户不存在");
    }

    public static String getDescription(String code) {
        return infos.get(code) == null ? "" : infos.get(code);
    }
}
