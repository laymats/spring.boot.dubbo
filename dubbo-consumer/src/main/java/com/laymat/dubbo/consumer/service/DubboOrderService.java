package com.laymat.dubbo.consumer.service;

import com.laymat.framework.service.order.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class DubboOrderService implements OrderService {
    @Reference
    private OrderService orderService;

    @Override
    public String getOrderInfo(String orderID) {
        return orderService.getOrderInfo(orderID);
    }
}
