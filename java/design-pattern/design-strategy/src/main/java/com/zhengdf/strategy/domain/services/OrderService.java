package com.zhengdf.strategy.domain.services;

import com.zhengdf.strategy.domain.dto.OrderDto;
import com.zhengdf.strategy.handler.OrderStrategy;
import com.zhengdf.strategy.handler.factory.HandlerOrderContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: design-pattern
 * @description: 订单服务
 * @author: xxx
 * @create: 2020-05-06 16:29
 */
@Service
public class OrderService {
    @Autowired
    HandlerOrderContext orderContext;

    public String handleOrder(OrderDto order) {
        //使用策略处理订单
        OrderStrategy orderStrategy = orderContext.getOrderStrategy(order.getType());
        return orderStrategy.handle(order);
    }

}
