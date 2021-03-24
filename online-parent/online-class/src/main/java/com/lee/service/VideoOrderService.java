package com.lee.service;

import com.lee.domain.OrderEntity;
import com.lee.domain.VideoOrder;

import java.util.List;

public interface VideoOrderService {
    int save(OrderEntity orderEntity);

    List<VideoOrder> findByOrderWithUserId(Integer userId);
}
