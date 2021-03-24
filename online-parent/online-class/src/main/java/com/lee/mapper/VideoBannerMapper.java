package com.lee.mapper;

import com.lee.domain.VideoBanner;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoBannerMapper {
    List<VideoBanner> getListVideoBanner();
}
