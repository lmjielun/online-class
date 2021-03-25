package com.lee.service.impl;

import com.lee.config.BaseCache;
import com.lee.constant.CacheKeyManager;
import com.lee.domain.VideoBanner;
import com.lee.mapper.VideoBannerMapper;
import com.lee.service.VideoBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

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

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<VideoBanner> getListVideoBanner() {
        List<VideoBanner> videoBannerList = new ArrayList<>();
            // 可以换成从redis缓存中获取
            // videoBannerList  = (List<VideoBanner>) redisTemplate.opsForValue().get(CacheKeyManager.INDEX_BANNER_KEY);
            // if(videoBannerList == null || videoBannerList.size() < 0 ){
            // videoBannerList = videoBannerMapper.getListVideoBanner();
            //  System.out.println("从数据库获取，放入redis缓存....");
            //  redisTemplate.opsForValue().set(CacheKeyManager.INDEX_BANNER_KEY,videoBannerList,7, TimeUnit.DAYS);
            //}

        // guava缓存
        try {
             //按key值，从缓存中获取数据，如果没有调用 ()-> 函数，到数据库查询
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return videoBannerList;
    }
}
