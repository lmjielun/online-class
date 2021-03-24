package com.lee.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lee.utils.JWTUtils;
import com.lee.utils.JsonData;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @projectName：online_edu
 * @Description: 登录校验
 * @Author limingheng
 * @Date -03-05  11:19
 */
public class LoginInterceptor implements HandlerInterceptor {

    /***
     * 进入到controller之前的方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            // 从request请求头中，获取token
            String accessToken = request.getHeader("token");

            // 如果token为空从请求头中获取
            if(StringUtils.isEmpty(accessToken)){
                // 如果还是空，那么就从另外的参数中获取
                accessToken = request.getParameter("token");
                return false;
            }

            // accessToken不为空，执行登录成功逻辑
            if(StringUtils.isNoneBlank(accessToken)){
                // 如果token不是空的，进行校验
                Claims claims = JWTUtils.checkJWTToken(accessToken);
                if(claims == null){
                    // 如果为空，说明token过期，重新登录，将内容响应给前端
                    sendJsonMessage(response, JsonData.error("登录过期，请重新登录"));
                }
                // 获取用户信息
                Integer userId = (Integer) claims.get("id");
                String username = (String) claims.get("username");

                // 存储到 request 中
                request.setAttribute("userId",userId);
                request.setAttribute("username",username);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    // 响应数据给前端
    public static void sendJsonMessage(HttpServletResponse response,Object obj){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            // 设置响应类型
            response.setContentType("application/json;charset=utf-8");
            // 获取响应流
            PrintWriter writer = response.getWriter();
            // 写出内容
            writer.println( objectMapper.writeValueAsString(obj));
            // 关闭流
            writer.close();
            // 刷新
            response.flushBuffer();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
