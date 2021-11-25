package com.example.Demosampleproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket customDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.torrent"))
				.paths(PathSelectors.regex("/api.*")).build().apiInfo(apiInfo());
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("Demosampleproject",
				"An application to search Movies from a MovieList repository by MovieListID", "Demosampleproject v1",
				"Terms of service", "Prasanth", "License of API", "https://Demosampleproject");
		return apiInfo; 
	}
}