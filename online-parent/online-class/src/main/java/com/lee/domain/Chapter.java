package com.lee.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Description: 视频章节
 */
@Data
public class Chapter {
    private int chapterId;
    private int videoId; // '视频主键',
    private String title; // '章节名称',
    private int  ordered; // '章节顺序',
    private Date createTime; // '创建时间',
    private List<Episode> episodeList; // 节
}
