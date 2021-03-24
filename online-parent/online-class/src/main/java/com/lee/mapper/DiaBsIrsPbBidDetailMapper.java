package com.lee.mapper;

import com.lee.domain.DiaBsIrsPbBidDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaBsIrsPbBidDetailMapper {

    int save(@Param("list") List<DiaBsIrsPbBidDetail> diaBsIrsPbBidDetails);

    int delete(@Param("planYear") String yearPlan);

    int selectByPlanYear(@Param("planYear") String yearPlan);

    int selectCount();

    List getTableDateByTableName(@Param("start") int start, @Param("end") int end);
}
