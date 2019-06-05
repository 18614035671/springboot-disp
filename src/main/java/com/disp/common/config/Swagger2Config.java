package com.disp.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author zd-jsb
 */
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //不能com.disp.*
                .apis(RequestHandlerSelectors.basePackage("com.disp.sys.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API文档")
                //.description("简单优雅的restfun风格，https://www.disputess.com")
                //.termsOfServiceUrl("https://www.disputess.com")
                .version("1.0")
                //.contact(new Contact("X.Z.L", "https://www.disputess.com", "18614035671@163.com"))
                .build();
    }
}
