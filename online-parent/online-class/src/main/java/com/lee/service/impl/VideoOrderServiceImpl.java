package com.lee.service.impl;

import com.lee.domain.*;
import com.lee.exception.XDException;
import com.lee.mapper.EpisodeMapper;
import com.lee.mapper.PlayRecordMapper;
import com.lee.mapper.VideoMapper;
import com.lee.mapper.VideoOrderMapper;
import com.lee.service.VideoOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class VideoOrderServiceImpl implements VideoOrderService {
    private final static Logger logger = LoggerFactory.getLogger(VideoOrderServiceImpl.class);

    @Autowired
    private VideoOrderMapper videoOrderMapper;

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private PlayRecordMapper playRecordMapper;

    @Autowired
    private EpisodeMapper episodeMapper;

    /**
     *  下单操作
     *  未来可添加：优惠券抵扣、风控用户检查、生成订单基础信息、生成支付信息等
     */
    @Override
    @Transactional
    public int save(OrderEntity orderEntity) {
        int result = -1;
        // 先查询视频是否存在
        Video video = videoMapper.findById(orderEntity.getVideoId());
        if(video == null){
            logger.error("下单失败，视频"+orderEntity.getVideoId()+"不存在");
            throw new XDException(-1,"下单失败，视频不存在");
        }
        // 业务要求：该订单用户是否已经下过单。一个教程只能给一个用户下单
        VideoOrder videoOrder = videoOrderMapper.selectByUserIdAndVideoId(orderEntity.getUserId(),orderEntity.getVideoId());
        // 执行下单，获取结果
        result = getResult(orderEntity, result, video, videoOrder);
        // 下单后，支付成功，生成播放记录，放入到播放记录表
        if(result == 1){
            logger.debug("下单成功..." + result);
            // 下单后，默认视频节点信息为第一个视频第一集
            Episode episode = episodeMapper.findByFirstVideo(video.getVideoId());
            if(episode != null){
                // 播放记录实例对象
                PlayRecord playRecord = new PlayRecord();
                playRecord.setCreateTime(new Date());
                // 设置播放记录的 视频  第x个视频
                playRecord.setVideoId(video.getVideoId());
                // 设置播放记录的 章节 第x个章节
                playRecord.setEpisodeId(episode.getEpisodeId());
                // 设置播放记录的 第x集
                playRecord.setCurrentNum(episode.getNum());
                // 设置播放记录的 用户信息
                playRecord.setUserId(orderEntity.getUserId());
                playRecordMapper.save(playRecord);
                logger.debug("[ 播放记录生成成功 ] " );
            }else {
                logger.error("生成[播放记录失败]，该视频的episode为Null");
                //  throw new XDException(-1,"生成 [播放记录失败] ");
            }

        }
        return result;
    }
    /**
     *  执行下单，返回下单结果
     */
    private int getResult(OrderEntity orderEntity, int result, Video video, VideoOrder videoOrder) {
        if(videoOrder == null){ // 说明没有下过单
            // 创建订单实体类
            VideoOrder order = new VideoOrder();
            // TODO 以后可以使用雪花算法 订单唯一标识
            order.setOutTradeNo(UUID.randomUUID().toString().replace("-",""));
            // TODO 默认为已支付，以后接入支付接口，可以改下
            order.setState(1);
            // 订单生成时间
            order.setCreateTime(new Date());
            // 支付金额
            order.setTotalFee(video.getPrice());
            // 视频id
            order.setVideoId(video.getVideoId());
            // 视频标题
            order.setVideoTitle(video.getTitle());
            // 视频图片
            order.setVideoImg(video.getCoverImg());
            // 用户id
            order.setUserId(orderEntity.getUserId());
            // 保存 目前字段不多，如果字段多了，可以使用BeanUtils.copy()
            result = videoOrderMapper.save(order);
        }else{ // 说明下过单了
            int state = videoOrder.getState();
            // 0表示未支付，1表示已支付
            if(state == 0){
                logger.error("下单失败，该视频"+orderEntity.getVideoId()+"已有订单，但是未支付");
                throw new XDException(-1,"下单失败，已有订单未支付");
            }
            if(state == 1){
                logger.error("下单失败，该视频"+orderEntity.getVideoId()+"已购买");
                throw new XDException(-1,"下单失败，已购买过该课程");
            }
        }
        return result;
    }

    /**
     *  根据用户id查询用户订单信息
     */
    @Override
    public List<VideoOrder> findByOrderWithUserId(Integer userId) {
        return videoOrderMapper.findByUserId(userId);
    }
}
