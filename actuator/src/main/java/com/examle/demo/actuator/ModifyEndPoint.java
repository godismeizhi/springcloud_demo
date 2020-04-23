package com.examle.demo.actuator;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义端点
 */
@Component
@Endpoint(id = "modify")
public class ModifyEndPoint {

    @ReadOperation
    public Map<String, Object> getInfo() {
        Map map = new HashMap();
        map.put("2312312", "2312");
        return map;
    }
}
