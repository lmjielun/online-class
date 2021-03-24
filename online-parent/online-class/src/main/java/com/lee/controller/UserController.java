package com.lee.controller;

import com.lee.domain.LoginEntity;
import com.lee.domain.User;
import com.lee.service.UserService;
import com.lee.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-04  21:01
 */
@RestController
@RequestMapping("/api/v1/pri/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
    * @Description:  用户注册
    */
    @PostMapping("/register")
    public JsonData register(@RequestBody  @Valid User user){
        userService.register(user);
        return JsonData.success("注册成功...");
    }

    /***
     *  用户登录
     */
    @PostMapping("/login")
    public JsonData login(@RequestBody @Valid LoginEntity loginEntity){
        String token = userService.login(loginEntity);
        return token == null ? JsonData.error("登录失败，账号/密码错误") : JsonData.success(token);
    }

    @GetMapping("/getUserInfo")
    public JsonData getUserInfo(HttpServletRequest request){
        // 从request中获取，因为登录的时候，我们将这些信息，从拦截器中，放入到了request作用域中
        Integer userId = (Integer) request.getAttribute("userId");
        if(userId == null){
            return JsonData.error("查询失败,请登录");
        }
        User user = userService.findById(userId);
        return JsonData.success(user);
    }


}
