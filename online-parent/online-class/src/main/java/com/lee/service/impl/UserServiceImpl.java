package com.lee.service.impl;

import com.lee.domain.LoginEntity;
import com.lee.domain.User;
import com.lee.exception.XDException;
import com.lee.mapper.UserMapper;
import com.lee.service.UserService;
import com.lee.utils.CreateImgRandom;
import com.lee.utils.JWTUtils;
import com.lee.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-04  21:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /***
     * 用户注册
     */
    @Override
    public int register(User user) {
        // 根据手机号查询，看是否已经注册
        int phone = userMapper.selectByPhone(user.getPhone());
        int result = 0;
        if (phone == 0) {
            String pwd = user.getPwd();
            String password = MD5Util.MD5(pwd);
            user.setPwd(password);
            if(StringUtils.isEmpty(user.getHeadImg())){
                user.setHeadImg( CreateImgRandom.getImg());
            }
            result = userMapper.register(user);
        } else {
            throw new XDException(20, "手机号已存在");
        }
        return result;
    }

    /***
     * 登录 返回token，用户名和密码，放在了拦截器中，使用request获取
     */
    @Override
    public String login(LoginEntity loginEntity) {
        String password = MD5Util.MD5(loginEntity.getPassword());
        String phone = loginEntity.getPhone();
        User user = userMapper.login(phone,password);
        if(user == null){
            throw new XDException(-1,"登录失败，账号/密码错误");
        }
        return  JWTUtils.createToken(user);
    }

    @Override
    public User findById(Integer userId) {
        User user = userMapper.findById(userId);
        return user;
    }
}
