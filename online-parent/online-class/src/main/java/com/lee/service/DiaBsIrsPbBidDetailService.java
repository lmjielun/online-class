package com.lee.service;

import com.lee.domain.DiaBsIrsPbBidDetail;

import java.util.List;

public interface DiaBsIrsPbBidDetailService {

    void save(List<DiaBsIrsPbBidDetail> diaBsIrsPbBidDetails);

    void delete(String yearPlan);
}
