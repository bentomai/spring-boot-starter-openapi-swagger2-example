package io.github.bentomai.configuration;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnProperty(prefix = "springdoc.api-docs",name = "enabled", havingValue = "true")
public class SpringDocAutoConfiguration {

    @OpenAPIDefinition(
            servers = {
                    @Server(description = "开发环境服务器", url = "http://localhost:8080"),
            },
            externalDocs = @ExternalDocumentation(
                    description = "项目编译部署说明",
                    url = "http://localhost:8080/deploy/readme.md"
            )
    )
    @Configuration
    public static class SpringDocConfig {
        @Bean
        public OpenAPI openAPI() {
            return new OpenAPI()
                    // 配置接口文档基本信息
                    .info(this.getApiInfo());
        }
        private Info getApiInfo() {
            return new Info()
                    // 配置文档标题
                    .title("SpringBoot3集成Swagger3适配Swagger2注解")
                    // 配置文档描述
                    .description("SpringBoot3集成Swagger3适配Swagger2注解示例文档")
                    // 配置作者信息
                    .contact(new Contact().name("Bento Mai").url("https://www.xxxxx.cn").email("641298213@qq.com"))
                    // 配置License许可证信息
                    .license(new License().name("Apache 2.0").url("https://gitee.com/bento_mai/spring-boot-starter-openapi-swagger2/blob/master/LICENSE"))
                    .summary("SpringBoot3集成Swagger3适配Swagger2注解示例文档")
                    .termsOfService("https://www.xxxxx.cn")
                    // 配置版本号
                    .version("1.0.0");
        }
    }

}