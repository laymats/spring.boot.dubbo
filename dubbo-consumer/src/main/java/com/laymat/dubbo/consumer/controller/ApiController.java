package com.laymat.dubbo.consumer.controller;

import com.laymat.dubbo.consumer.service.DubboOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ApiController {

    @Resource
    DubboOrderService dubboOrderService;

    @GetMapping("/order")
    public String getOrder(@RequestParam String orderID){
        return dubboOrderService.getOrderInfo(orderID);
    }
}
