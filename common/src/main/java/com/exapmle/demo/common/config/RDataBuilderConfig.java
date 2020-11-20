package com.exapmle.demo.common.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@ConditionalOnClass()
@Slf4j
@EnableConfigurationProperties(RDataBuildProperties.class)
public class RDataBuilderConfig {

    @Resource
    private RDataBuildProperties buildConfig;


}
