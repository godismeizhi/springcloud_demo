package com.exapmle.demo.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jackjson.serializer")
@Data
public class JackJsonSerializerProperties {

    private boolean timestamp = false;
}
