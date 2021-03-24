package com.lee.mapper;

import com.lee.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int selectByPhone(@Param("phone") String phone);
    int register(User user);
    User login(@Param("phone") String phone, @Param("password") String password);
    User findById(@Param("userId") Integer userId);
}
