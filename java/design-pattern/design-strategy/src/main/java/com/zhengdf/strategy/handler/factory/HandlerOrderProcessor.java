package com.zhengdf.strategy.handler.factory;

import com.zhengdf.strategy.annotation.HandlerOrderType;
import com.zhengdf.strategy.handler.OrderStrategy;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: design-pattern
 * @description:策略核心功能,获取所有策略注解的类型;并将对应的class初始化到HandlerOrderContext中
 * @author: xxx
 * @create: 2020-05-06 17:08
 */
@Component
public class HandlerOrderProcessor implements ApplicationContextAware {
    /*获取所有的策略Beanclass 加入HandlerOrderContext属性中*/
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //获取所有策略注解的Bean
        Map<String, Object> orderStrategyMap = applicationContext.getBeansWithAnnotation(HandlerOrderType.class);
        orderStrategyMap.forEach((k, v) -> {
            Class<OrderStrategy> orderStrategyClass = (Class<OrderStrategy>) v.getClass();
            String type = orderStrategyClass.getAnnotation(HandlerOrderType.class).value();
            //将class加入map中,type作为key
            HandlerOrderContext.orderStrategyBeanMap.put(type, orderStrategyClass);
        });
    }
}
