package com.lee.mapper;

import com.lee.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoMapper {
    /***
     *  获取视频列表
     */
    public List<Video> videoList();

    /***
     *  查询视频详情，根据id，包含章、节信息
     */
    Video getVideoDetail(@Param("videoId") Integer id);
    /**
     *  根据id查询视频信息，不包含章、节信息
     */
    Video findById(@Param("videoId") int videoId);

}
