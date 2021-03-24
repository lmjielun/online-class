package com.lee.mapper;

import com.lee.domain.VideoOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoOrderMapper {
    VideoOrder selectByUserIdAndVideoId(@Param("userId") int userId, @Param("videoId") int videoId);

    int save(VideoOrder order);

    List<VideoOrder> findByUserId(@Param("userId") Integer userId);
}
