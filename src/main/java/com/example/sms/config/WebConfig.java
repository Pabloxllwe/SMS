package com.example.sms.config;

import com.example.sms.interceptor.LoginCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //配置类
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //配置了一个拦截器，用于在请求处理之前进行登录验证。
        //如果用户访问的路径不是/userLogin，则会被loginCheckInterceptor拦截器处理
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**").excludePathPatterns("/userLogin");
    }
}
