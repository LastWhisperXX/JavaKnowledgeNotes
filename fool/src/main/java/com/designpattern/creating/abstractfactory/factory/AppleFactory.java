package com.designpattern.creating.abstractfactory.factory;

import com.designpattern.creating.abstractfactory.product.Apple;
import com.designpattern.creating.abstractfactory.product.Fruits;
import com.designpattern.creating.abstractfactory.product.Seed;

/**
 * @Describe
 * 工厂具体
 * @ClassName AppleFactory
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public class AppleFactory implements Factory{

    @Override
    public Fruits create() {
        Seed seed = new Seed("苹果种子");
        Apple apple = new Apple(seed);
        apple.setWater("已浇水");
        return apple;
    }
}
