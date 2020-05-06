package com.zhengdf.strategy.domain.rest;

import com.zhengdf.strategy.domain.dto.OrderDto;
import com.zhengdf.strategy.domain.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @program: design-pattern
 * @description: 订单类型接口
 * @author: xxx
 * @create: 2020-05-06 17:13
 */
@RestController
@RequestMapping("/api")
public class OrderTypeController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order/{type}")
    public String handle(@PathVariable String type){
        OrderDto dto = OrderDto.builder()
                .code("测试")
                .type(type)
                .price(new BigDecimal(12))
                .build();
        return orderService.handleOrder(dto);
    }
}
