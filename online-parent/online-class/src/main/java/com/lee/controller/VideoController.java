package com.lee.controller;

import com.lee.domain.Video;
import com.lee.service.VideoService;
import com.lee.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-04  14:06
 */
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    /***
     *  获取视频列表
     */
    @GetMapping("/list")
    public JsonData getVideoList(){
        List<Video> videoList = videoService.getVideoList();
        return JsonData.success(videoList);
    }

    /***
     *  查询视频详情，根据id，包含章、节信息
     */
    @GetMapping("/find_detail")
    public JsonData getVideoDetail(Integer id){
        Video video = videoService.getVideoDetail(id);
        return JsonData.success(video);

    }
}
