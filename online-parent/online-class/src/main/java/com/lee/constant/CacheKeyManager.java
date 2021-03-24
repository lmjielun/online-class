package com.lee.constant;
/**
 * @projectName：online_edu
 * @Description: 缓存Key设置
 * @Author limingheng
 * @Date -03-07  13:26
 */
public class CacheKeyManager {
    // 轮播图缓存key
    public static final String INDEX_BANNER_KEY = "index:banner";
    // 首页视频列表缓存key
    public static final String INDEX_VIDEO_KEY = "index:video_img";
    // 视频详情缓存key %s 是视频id，占位符，可以使用String.format()方法，将值放入进去
    public static final String VIDEO_DETAIL = "video_detail:%s";
}
