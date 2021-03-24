package com.lee.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @projectName：online_class
 * @Description:
 * @Author limingheng
 * @Date -03-03  21:39
 */
@Data
public class User {
    private int userId;

    @NotNull(message = "用户名不能为空")
    private String name;

    @NotNull(message = "密码不能为空")
    private String pwd;

    private String headImg; // 头像

    @NotNull(message = "手机号不能为空")
    @Pattern(regexp = "1[3|4|5|7|8][0-9]\\d{8}",message = "手机号码错误")
    private String phone; // 手机号

    private Date createTime;
}
