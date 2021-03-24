package com.lee.mapper;

import com.lee.domain.PlayRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayRecordMapper {
    int save(PlayRecord playRecord);
}
