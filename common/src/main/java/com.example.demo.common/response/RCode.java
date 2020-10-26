package com.example.demo.common.response;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RCode {


    public static String SUCCESS = "200";

    public static String NOTFOUND = "404";

    public static String SYSERROR = "500";


    public static Map<String, String> infos = new ConcurrentHashMap<>();

    static {
        infos.put(SYSERROR, "系统错误");
        infos.put(NOTFOUND, "找不到资源");
        infos.put(SUCCESS, "操作成功");
    }

    public static String getDescription(String code) {
        return infos.get(code) == null ? "" : infos.get(code);
    }
}
