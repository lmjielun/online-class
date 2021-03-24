package com.lee.service;

import com.lee.domain.Video;

import java.util.List;

public interface VideoService {
    /***
     *  获取视频列表
     */
    public List<Video> getVideoList();

    /***
     *  查询视频详情，根据id，包含章、节信息
     */
    Video getVideoDetail(Integer id);
}
