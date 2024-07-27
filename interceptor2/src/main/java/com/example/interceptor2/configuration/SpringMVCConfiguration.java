package com.example.interceptor2.configuration;

import com.example.interceptor2.interceptors.MonthInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfiguration implements WebMvcConfigurer {

@Autowired
private MonthInterceptors monthInterceptors;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(monthInterceptors).addPathPatterns("/months");


    }
}
