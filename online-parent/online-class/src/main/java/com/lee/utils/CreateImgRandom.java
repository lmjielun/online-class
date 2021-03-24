package com.lee.utils;

import java.util.Random;

/**
 *  生成随机头像
 */
public class CreateImgRandom {
    private static final String [] headImg = {
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/12.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/11.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/13.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/14.jpeg",
            "https://xd-video-pc-img.oss-cnbeijing.aliyuncs.com/xdclass_pro/default/head_img/15.jpeg"
    };
    public static String getImg(){
        int size = headImg.length;
        Random random = new Random();
        int i = random.nextInt(size);
        return headImg[i];
    }
}
