package com.dgut.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * swagger配置类
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/1/31 16:43
 */
@Configuration
@EnableSwagger2
public class swaggerConfig {

    @Bean
    public Docket swagger(){
        ApiInfo apiInfo = new ApiInfo("家教信息平台","家教信息平台",null,null,null,null,null);
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.dgut.controller")).build()
                .apiInfo(apiInfo).useDefaultResponseMessages(false);
        return docket;
    }

}
