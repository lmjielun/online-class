package com.lee.config;

import com.lee.interceptor.CorsInterceptor;
import com.lee.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 过滤器拦截器配置
 *       不用登录就可以访问的     /api/v1/pub/**
 *       需要登录菜可以访问的    /api/v1/pri/**
 */
@Configuration
public class InterceptorCofig implements WebMvcConfigurer {
    // 注入自己写的过滤器，看自己需求，需要哪些，注入哪些
    @Bean
    LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }

    // 注入自己写的跨域的 过滤器
    @Bean
    CorsInterceptor corsInterceptor(){
        return new CorsInterceptor();
    }

    // 添加(注册)拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 跨域需要写在最前边  跨域需要拦截所有路径
        registry.addInterceptor(corsInterceptor()).addPathPatterns("/**");
        // 登录过滤器
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/api/v1/pri/*/*/**") // 需要拦截路径
                .excludePathPatterns("/api/v1/pri/user/login","/api/v1/pri/user/register"); // 不需要拦截的路径
        // 将注册好的 拦截器 放入到webmvc中
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
