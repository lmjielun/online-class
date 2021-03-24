package com.lee.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *  进行登录的时候用的实体类，和user实体类分开使用
 */
@Data
public class LoginEntity {
    @NotNull(message = "密码不能为空")
    private String password;

    @Pattern(regexp = "1[3|4|5|7|8][0-9]\\d{8}",message = "手机号码错误")
    @NotNull(message = "手机号不能为空")
    private String phone;


}
