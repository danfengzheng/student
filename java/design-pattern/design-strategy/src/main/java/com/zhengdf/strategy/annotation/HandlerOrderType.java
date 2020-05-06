package com.zhengdf.strategy.annotation;

import java.lang.annotation.*;

/*注解出现的位置 type指 Class  ElementType 为spring boot提供的枚举类*/
@Target({ElementType.TYPE})
/*注释保留时间*/
@Retention(RetentionPolicy.RUNTIME)
/*表明这个注释是由 javadoc记录的*/
@Documented
public @interface HandlerOrderType {
    String value();
}
