package com.lee.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @projectName：online_class
 * @Description:
 * @Author limingheng
 * @Date -03-03  21:41
 */
@Data
public class Video {
    private int VideoId;
    private String title; // 标题
    private String summary; // 概述
    private String coverImg; // 封面图
    private int price;  // 价格
    private Date createTime; // 日期
    private double point; // 评分，默认8.7
    List<Chapter> chapterList; // 章集合
}
