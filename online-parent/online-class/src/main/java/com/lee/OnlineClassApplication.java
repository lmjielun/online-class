package com.lee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @projectName：online-edu
 * @Description:
 * @Author limingheng
 * @Date -03-24  16:12
 */
@SpringBootApplication
@MapperScan("com.lee.mapper")
public class OnlineClassApplication {
    public static void main(String[] args) {
            SpringApplication.run(OnlineClassApplication.class,args);
    }
}
