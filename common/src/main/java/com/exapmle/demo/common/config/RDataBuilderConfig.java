package com.exapmle.demo.common.config;

import com.exapmle.demo.common.response.ErrorInfo;
import com.exapmle.demo.common.response.RData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@ConditionalOnClass({RData.Builer.class, RData.class})
@Slf4j
@EnableConfigurationProperties(RDataBuildProperties.class)
public class RDataBuilderConfig {

    @Resource
    private RDataBuildProperties buildConfig;

    @Bean
    @ConditionalOnMissingBean({RData.Builer.class, RData.class})
    public RData.Builer initRdataBuilder() {
        log.info("================init RDataBuilder=============");
        return new RData.Builer();
    }

    @Bean
    @ConditionalOnMissingBean({ErrorInfo.Builer.class, Error.class})
    public ErrorInfo.Builer initErrorInfoBuilder() {
        log.info("================init ErrorInfoBuilder=============");
        return new ErrorInfo.Builer();
    }
}
