package com.lee.domain;

import lombok.Data;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-08  11:36
 */
@Data
public class RequestEntity<T> {
    private String tableName;
    private String yearPlan;
    private T data;
}
