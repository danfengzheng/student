package com.zhengdf.strategy.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: design-pattern
 * @description: 订单实体
 * @author: xxx
 * @create: 2020-05-06 16:27
 */
@Data
@Builder
public class OrderDto {
    private String code;
    private BigDecimal price;
    private String type;
    private Integer a;
}
