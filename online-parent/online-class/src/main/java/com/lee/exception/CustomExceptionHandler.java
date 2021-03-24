package com.lee.exception;

import com.lee.utils.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理类
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

    // 使用注解，确定监听哪种异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonData handler(Exception e){
        logger.error("[系统异常]:{}",e.getMessage());
        // 自定义异常
        if(e instanceof XDException ){
            XDException xdException = (XDException) e;
            return JsonData.error(xdException.getCode(),xdException.getMsg());
        }else{
            // 不是自定义异常，看是否是其他的异常，当然你还可以定义你的其他的异常
            return JsonData.error(e.getMessage());
        }
    }
    // 校验错误
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public JsonData adviceException(MethodArgumentNotValidException  e){
        // 获取到错误信息
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 将错误信息返回
        return JsonData.error(objectError.getDefaultMessage());
    }
}
