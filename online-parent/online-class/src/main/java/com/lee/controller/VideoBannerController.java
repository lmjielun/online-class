package com.lee.controller;

import com.lee.domain.VideoBanner;
import com.lee.service.VideoBannerService;
import com.lee.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-04  14:33
 */
@RestController
@RequestMapping("/api/v1/pub/videoBanner")
public class VideoBannerController {

    @Autowired
    private VideoBannerService videoBannerService;



    @GetMapping("/list")
    public JsonData getListVideoBanner(){
        List<VideoBanner> listVideoBanner = videoBannerService.getListVideoBanner();
        return JsonData.success(listVideoBanner);
    }
}
