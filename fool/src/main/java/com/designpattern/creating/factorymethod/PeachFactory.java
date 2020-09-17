package com.designpattern.creating.factorymethod;

/**
 * @Describe
 * @ClassName PeachFactory
 * @Author ZhuXunComputer
 * @Date 2020/8/18
 * @Version JDK1.8
 */
public class PeachFactory implements Factory {

    /**
     * 实现工厂的创建方法
     * 对实例进行专项处理
     * @return 实例父类
     */
    @Override
    public Fruits create() {
        Peach peach = new Peach();
        peach.seed = new Seed();
        peach.water = new Water();
        return peach;
    }
}
