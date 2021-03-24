package com.lee.domain;

import lombok.Data;

import java.util.Date;

/**
 * @projectName：online_class
 * @Description: 轮播图
 * @Author limingheng
 * @Date -03-03  21:43
 */
@Data
public class VideoBanner
{
    private int bannerId;
    private String url;
    private String img;
    private Date createTime;
    private int weight; // 数字越小越靠前
}
