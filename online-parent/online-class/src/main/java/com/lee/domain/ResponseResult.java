package com.lee.domain;

import lombok.Data;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-08  09:50
 */
@Data
public class ResponseResult {
    private Integer code;
    private String msg;

    public static ResponseResult success(){
        return new ResponseResult(200);
    }

    public static ResponseResult error(){
        return new ResponseResult(-100);
    }


    private ResponseResult(Integer code){
        this.code = code;
    }
}
