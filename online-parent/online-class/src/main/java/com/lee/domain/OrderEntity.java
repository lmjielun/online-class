package com.lee.domain;

import lombok.Data;

/**
 *   订单【请求实体类】
 *  下单用到的实体类，和videoOrder分开使用，作为请求实体类
 *  目前只有1个id字段，如果后续有扩展，可以将属性加入进来
 */
@Data
public class OrderEntity {
    private int videoId;
    private int userId;
}
