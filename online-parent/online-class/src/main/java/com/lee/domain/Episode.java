package com.lee.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 节
 */
@Data
public class Episode {
    private int episodeId;
    private String title; // '集标题',
    private int num; // '第几集,全局顺序',
    private int ordered; // '顺序，章里面的顺序',
    private String playUrl; // '播放地址',
    private int chapterId; // '章节主键id',
    private int free; // '0表示免费，1表示首付',
    private int videoId; // '视频id',
    private Date createTime; // '创建时间',
}
