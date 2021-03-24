package com.lee.service.impl;

import com.lee.config.BaseCache;
import com.lee.constant.CacheKeyManager;
import com.lee.domain.Video;
import com.lee.mapper.VideoMapper;
import com.lee.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-04  14:10
 */
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private BaseCache baseCache;
    /***
     *  获取视频列表
     */
    @Override
    public List<Video> getVideoList() {
        List<Video> list = new ArrayList<>();
        try {
            // 首页的视频列表，放入缓存
            Object cacheObj = baseCache.getTenMinuteCache().get(CacheKeyManager.INDEX_VIDEO_KEY, () -> {
                System.out.println("从数据库获取首页视频列表......");
                return videoMapper.videoList();
            });
            if(cacheObj instanceof List){
                list = (List<Video>) cacheObj;
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return list;
    }

    /***
     *  查询视频详情，根据id，包含章、节信息
     */
    @Override
    public Video getVideoDetail(Integer id) {
        Video video = null;
        try {
            // 将id 替换key里的 %s占位符
            String videoDetailKey = String.format(CacheKeyManager.VIDEO_DETAIL,id);
            Object cacheObj = baseCache.getOneHourCache().get(videoDetailKey, () -> {
                return videoMapper.getVideoDetail(id);
            });

            if(cacheObj instanceof Video){
                video = (Video) cacheObj;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return video;
    }
}
