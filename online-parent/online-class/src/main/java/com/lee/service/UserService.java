package com.lee.service;

import com.lee.domain.LoginEntity;
import com.lee.domain.User;

public interface UserService {

    int  register(User user);

    String login(LoginEntity loginEntity);

    User findById(Integer userId);
}
