package com.lee.service.impl;

import com.lee.config.BaseCache;
import com.lee.constant.CacheKeyManager;
import com.lee.domain.VideoBanner;
import com.lee.mapper.VideoBannerMapper;
import com.lee.service.VideoBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-04  14:36
 */
@Service
public class VideoBannerServiceImpl implements VideoBannerService {
    @Autowired
    private VideoBannerMapper videoBannerMapper;

    // 注入缓存
    @Autowired
    private BaseCache baseCache;

    @Override
    public List<VideoBanner> getListVideoBanner() {
        List<VideoBanner> videoBannerList = new ArrayList<>();
        try {
            // 按key值，从缓存中获取数据，如果没有调用 ()-> 函数，到数据库查询
            Object cacheObj = baseCache.getTenMinuteCache().get(CacheKeyManager.INDEX_BANNER_KEY, () -> {
                List<VideoBanner> videoBanners = videoBannerMapper.getListVideoBanner();
                System.out.println("从数据库查询轮播图......");
                // 将查询结果返回
                return videoBanners;
            });
            // 判断返回结果是否是list集合
            if(cacheObj instanceof List){
                // 将Obj强转为我们指定的类型
                videoBannerList = (List<VideoBanner>) cacheObj;
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return videoBannerList;
    }
}
