package com.jingyuu.ershoujing.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;


/**
 * @author owen
 * @date 2017-07-26
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket hadesApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("account-center-api")
                .apiInfo(apiInfo())
                .select()
                .paths(hadesPaths())
                .build();
    }

    private Predicate<String> hadesPaths() {
        return or(
                regex("/account/cash.*")           // 现金账户
        );
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Account Center API-账户中心接口")
                .description("账户中心接口")
                .contact(new Contact("Owen", "http://hades.nongfenqi.net", "gekunjin@nongfenqi.com"))
                .version("1.0.0")
                .build();
    }
}