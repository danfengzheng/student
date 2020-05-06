package com.zhengdf.strategy.handler.biz;

import com.zhengdf.strategy.annotation.HandlerOrderType;
import com.zhengdf.strategy.consts.OrderTypes;
import com.zhengdf.strategy.domain.dto.OrderDto;
import com.zhengdf.strategy.handler.OrderStrategy;
import org.springframework.stereotype.Component;

/**
 * @program: design-pattern
 * @description: 处理普通订单
 * @author: xxx
 * @create: 2020-05-06 16:38
 */
@Component
@HandlerOrderType(OrderTypes.FREE)
public class NormalHandler extends OrderStrategy {
    @Override
    public String handle(OrderDto dto) {
        return "处理普通订单";
    }
}
