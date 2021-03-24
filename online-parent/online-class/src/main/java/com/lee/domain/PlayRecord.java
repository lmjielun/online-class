package com.lee.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 播放记录
 */
@Data
public class PlayRecord {
    private int playId;
    private int userId;
    private int videoId;
    private int currentNum; // 当前播放第几集
    private int episodeId; // 当前播放第几集第几个视频
    private Date createTime;
}
