package com.example.demo.video.response;

import com.exapmle.demo.common.response.RCode;

public class VideoCode extends RCode {

    public static final String VIDEO_NOT_EXAIT = "2001";

    static {
        infos.put(VIDEO_NOT_EXAIT, "资源不存在");
    }

    public static String getDescription(String code) {
        return infos.get(code) == null ? "" : infos.get(code);
    }
}
