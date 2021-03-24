package com.lee.controller;

import com.lee.domain.OrderEntity;
import com.lee.domain.VideoOrder;
import com.lee.service.VideoOrderService;
import com.lee.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-05  15:34
 */
@RestController
@RequestMapping("/api/v1/pri/order")
public class VideoOrderController {

    @Autowired
    private VideoOrderService videoOrderService;

    /**
     *  当进行下单操作的时候，所有的/api/v1/pri/路径都会被拦截器拦截
     *  被拦截后，会检查token，如果token不存在，需要重新登录，如果存在而且正确，说明登陆了，可直接下单
     */
    @PostMapping("/save")
    public JsonData saveOrder(@RequestBody OrderEntity orderEntity, HttpServletRequest request){
        // 获取用户id，知道哪个用户下单
        Integer userId = (Integer) request.getAttribute("userId");
        orderEntity.setUserId(userId);
        // TODO 如果有优惠券 等等 其他信息，可以向orderEntity添加这些属性，然后增加业务逻辑
        int result = videoOrderService.save(orderEntity);
        return result == 1 ? JsonData.success("下单成功") : JsonData.error("下单失败");
    }
    /**
     *  查询用户订单
     */
    @GetMapping("/list")
    public JsonData orderList(HttpServletRequest request){
        Integer userId = (Integer) request.getAttribute("userId");
        List<VideoOrder> videoOrders = videoOrderService.findByOrderWithUserId(userId);
        return JsonData.success(videoOrders);
    }


}
