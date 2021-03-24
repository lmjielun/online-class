package com.lee.domain;

import lombok.Data;

import java.util.Date;

/**
 * @projectName：online_class
 * @Description: 视频订单
 * @Author limingheng
 * @Date 2021-03-03  21:25
 */
@Data
public class VideoOrder {
     private int orderId;
     private String outTradeNo; // 订单编号唯一标识
     private int state; //'0表示未支付，1表示已支付',
     private Date createTime;// '订单生成时间',
     private int  totalFee;  // '支付金额，单位分',
     private int  videoId; // '视频主键',
     private String videoTitle; // '视频标题',
     private String videoImg; // '视频图片',
     private int   userId; // '用户id',
}
