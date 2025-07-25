package com.rekreation.springelk.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
  @Bean
  public OpenAPI productServiceOpenAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Product Service API")
                .version("1.0.0")
                .description("This is the Rest API for the Product Service")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")))
        .externalDocs(
            new ExternalDocumentation().description("You can refer to the documentation here"));
  }
}
