package com.lee.mapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.lee.service.impl.DiaBsIrsPbBidDetailServiceImpl;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VideoMapperTest {

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private DiaBsIrsPbBidDetailMapper diaBsIrsPbBidDetailMapper;

    @Autowired
    private DiaBsIrsPbBidDetailServiceImpl diaBsIrsPbBidDetailService;

    @Test
    public void videoList() throws JsonProcessingException, JSONException {
        String s = "[{\"id\":\"1\",\"text\":\"测试1\"},{\"id\":\"2\",\"text\":\"测试2\"},{\"id\":\"3\",\"text\":\"测试3\"}]";
        ArrayList<String> list = JSON.parseObject(s, new TypeReference<ArrayList<String>>() {
        });

        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            if (i == 1) {
                JSONObject jsonObject = JSON.parseObject(s1);
                String text = (String) jsonObject.get("text");
                System.out.println(text);
            }
        }
    }

    @Test
    public void uploadPlReleaseDetailData() {
    }



}