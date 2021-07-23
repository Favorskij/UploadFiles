package com.uploadfiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class RootConfig implements WebMvcConfigurer {


    // https://www.baeldung.com/spring-file-upload


    @Bean
    public CommonsMultipartResolver multipartResolver() {

        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(10485760);
        multipartResolver.setMaxInMemorySize(10485760);
        multipartResolver.setDefaultEncoding("UTF-8");

        return multipartResolver;
    }



}