package com.designpattern.creating.factorymethod;

/**
 * @Describe
 * @ClassName AppleFactory
 * @Author ZhuXunComputer
 * @Date 2020/8/18
 * @Version JDK1.8
 */
public class AppleFactory implements Factory {

    /**
     * 实现工厂的创建方法
     * 对实例进行专项处理
     * @return 实例父类
     */
    @Override
    public Fruits create() {
        Apple apple = new Apple();
        apple.seed = new Seed();
        apple.water = new Water();
        return apple;
    }
}
