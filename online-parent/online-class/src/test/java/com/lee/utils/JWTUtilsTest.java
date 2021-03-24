package com.lee.utils;

import com.lee.domain.User;
import io.jsonwebtoken.Claims;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class JWTUtilsTest {

    @Test
    public void createToken() {
        User user = new User();
        user.setUserId(1);
        user.setName("zhangsan");
        user.setHeadImg("png");

        String token = JWTUtils.createToken(user);
        System.out.println(token);

        Claims claims = JWTUtils.checkJWTToken(token);
        Object id = claims.get("id");
        System.out.println(id);
    }

    @Test
    public void checkJWTToken() {
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            objects.add(i+"===>123");
            objects.add(i+"===>456");
            System.out.println(objects.size());
        }
    }


    @Test
    public void Md5(){
        ArrayList<String> pawList = new ArrayList<>();

    }
}