package com.designpattern.creating.abstractfactory;

import com.designpattern.CreatingDemoInterface;
import com.designpattern.creating.abstractfactory.factory.AppleFactory;
import com.designpattern.creating.abstractfactory.factory.Factory;
import com.designpattern.creating.abstractfactory.factory.PeachFactory;
import com.designpattern.creating.abstractfactory.product.Fruits;

/**
 * @Describe
 * @ClassName AbstractFactory
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public class AbstractFactoryDemo implements CreatingDemoInterface {

    @Override
    public Object doTest() {
        Factory factory =  new AppleFactory();
        Fruits apple = factory.create();
        apple.getInfo();
        return null;
    }

    @Override
    public Object doContrast() {
        Factory factory =  new PeachFactory();
        Fruits fruits = factory.create();
        fruits.getInfo();
        return null;
    }
}
