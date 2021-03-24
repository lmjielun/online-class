package com.lee.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-04  14:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonData {
    private Integer code;
    private Object data;
    private String msg;
    /**
    * 成功，不反回任何信息
    */
    public static JsonData success(){
        return new JsonData(0,null,null);
    }

    /**
    *  成功，返回数据
    */
    public static JsonData success(Object data){
        return new JsonData(0,data,null);
    }

    /**
     *  失败，固定状态码
     */
    public static JsonData error(String msg){
        return new JsonData(-1,null,msg);
    }

    /**
     *  失败
     */
    public static JsonData error(Integer code, String msg){
        return new JsonData(code,null,msg);
    }


}
