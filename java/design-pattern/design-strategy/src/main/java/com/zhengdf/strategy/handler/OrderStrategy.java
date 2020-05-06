package com.zhengdf.strategy.handler;

import com.zhengdf.strategy.domain.dto.OrderDto;

/**
 * @program: design-pattern
 * @description:抽象类
 * @author: xxx
 * @create: 2020-05-06 16:26
 */
public abstract class OrderStrategy {
    abstract public String handle(OrderDto dto);
}
