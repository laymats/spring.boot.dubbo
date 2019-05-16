package com.laymat.dubbo.provider.impl;


import com.laymat.framework.service.order.OrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrderInfo(String orderID) {
        return String.format("订单ID [%s]", orderID);
    }
}
