package com.lee.exception;

import lombok.Data;

/**
 * 自定义异常
 */
@Data
public class XDException extends RuntimeException {
    private Integer code;
    private String msg;
    public XDException(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
