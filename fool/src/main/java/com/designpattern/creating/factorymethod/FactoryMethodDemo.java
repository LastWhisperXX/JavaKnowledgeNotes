package com.designpattern.creating.factorymethod;

/**
 * @Describe
 * @ClassName FactoryMethodDemo
 * @Author ZhuXunComputer
 * @Date 2020/8/18
 * @Version JDK1.8
 */
public class FactoryMethodDemo {

    public void testMethod(){
        Factory appleFactory = new AppleFactory();
        Fruits apple = appleFactory.create();
        Factory peachFactory = new PeachFactory();
        Fruits peach = peachFactory.create();

    }
}
