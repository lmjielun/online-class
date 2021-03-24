package com.lee.config;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @projectName：online_edu
 * @Description: 缓存
 * @Author limingheng
 * @Date -03-24  14:38
 */
@Component
@Data
public class BaseCache {

    // 创建缓存实例 10分钟过期
    private Cache<String,Object> tenMinuteCache = CacheBuilder.newBuilder()
            .initialCapacity(10) // 缓存初始容量
            .maximumSize(100) // 最大值
            .concurrencyLevel(5) // 并发数，有多少个线程可以往里写数据
            .expireAfterWrite(600, TimeUnit.SECONDS) // 缓存过期时间 写入后10 分钟
            .recordStats() // 统计缓存命中率，命中率高了，说明是热点数据
            .build();

    // 创建缓存实例 10分钟过期
    private Cache<String,Object> oneHourCache = CacheBuilder.newBuilder()
            .initialCapacity(10) // 缓存初始容量
            .maximumSize(100) // 最大值
            .concurrencyLevel(5) // 并发数，有多少个线程可以往里写数据
            .expireAfterWrite(3600, TimeUnit.SECONDS) // 缓存过期时间 写入后1小时
            .recordStats() // 统计缓存命中率，命中率高了，说明是热点数据
            .build();

}
