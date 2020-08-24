package com.designpattern.creating.abstractfactory.factory;

import com.designpattern.creating.abstractfactory.product.Fruits;

/**
 * @Describe
 * 工厂抽象
 * @ClassName Factory
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public interface Factory {
    /**
     *
     * @return
     */
    Fruits create();
}
