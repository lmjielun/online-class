package com.lee.interceptor;

import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 设置跨域
 */
public class CorsInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Origin",request.getHeader("origin"));
        response.setHeader("Access-Control-Allow-Credentials","true");
        response.setHeader("Access-Control-Allow-Methods","GET,HEAD,POST,PUT,PATCH,DELETE,OPTIONS");
        response.setHeader("Access-Control-Allow-Headers","*");
        // 预检查方法
        if(HttpMethod.OPTIONS.toString().equals(request.getMethod())){
            return true;
        }
        return true;
    }
}
