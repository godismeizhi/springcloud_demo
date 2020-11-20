package com.example.demo.video.response;

import com.exapmle.demo.common.response.CommonCode;

public class VideoCode extends CommonCode {

    public static final String VIDEO_NOT_EXAIT = "2001";

    static {
        infos.put(VIDEO_NOT_EXAIT, "资源不存在");
    }

    public VideoCode() {
        super(code, message);
    }

    public static String getDescription(String code) {
        return infos.get(code) == null ? "" : infos.get(code);
    }
}
