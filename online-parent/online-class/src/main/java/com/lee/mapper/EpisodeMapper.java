package com.lee.mapper;

import com.lee.domain.Episode;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeMapper {
    Episode findByFirstVideo(@Param("videoId") int videoId);
}
