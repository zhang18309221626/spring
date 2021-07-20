package com.ym.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.RequestHandledEvent;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @title: SwaggerConfig
 * @Author Tan
 * @Date: 2021/7/19 10:21
 * @Version 1.0
 */
//声明该类为配置类
@Configuration
//声明启动swagher2
@EnableSwagger2
//声明启动mvc
@EnableWebMvc
public class SwaggerConfig {
    @Bean
    public Docket StudentDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ym.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("ticket API接口")
                .version("1.1.0")
                .build();
    }

}
