package com.lee.service.impl;

import com.lee.domain.DiaBsIrsPbBidDetail;
import com.lee.exception.XDException;
import com.lee.mapper.DiaBsIrsPbBidDetailMapper;
import com.lee.service.DiaBsIrsPbBidDetailService;
import com.lee.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-08  09:56
 */
@Service
public class DiaBsIrsPbBidDetailServiceImpl implements DiaBsIrsPbBidDetailService {

    @Autowired
    private DiaBsIrsPbBidDetailMapper diaBsIrsPbBidDetailMapper;

    //@Autowired
    //ThreadPoolExecutor executor;

    public static ExecutorService executor = Executors.newFixedThreadPool(20);

    public List getTableDateByTableName(int start,int end){
        return    diaBsIrsPbBidDetailMapper.getTableDateByTableName(start,end);
    }

    @Override
    @Transactional
    public void save(List<DiaBsIrsPbBidDetail> diaBsIrsPbBidDetails) {
         CompletableFuture.runAsync(() -> {
            // 模拟执行业务1，基本信息的提取
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
            int result = diaBsIrsPbBidDetailMapper.save(diaBsIrsPbBidDetails);
            if(result !=  diaBsIrsPbBidDetails.size()){
                throw new XDException(-100,"插入数据与传递数据不一致");
            }
            System.out.println(df.format(new Date()) + " | " + Thread.currentThread().getName() + " | " + result);
        }, executor);

        List paramList = new ArrayList();
        paramList.toArray();
        paramList.clear();
        HashMap<Object, Object> map = new HashMap<>();
        List paramList2 = (List) map.get("paramList");
    }

    @Override
    public void delete(String yearPlan) {
        int count = diaBsIrsPbBidDetailMapper.selectByPlanYear(yearPlan);
        if(count > 0 ) {
            int result = diaBsIrsPbBidDetailMapper.delete(yearPlan);
            if (result == 0) {
                JsonData.error("删除失败");
                throw new XDException(-100, "删除失败");
            }
        }
    }
}
