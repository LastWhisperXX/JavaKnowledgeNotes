package com.designpattern.creating.abstractfactory.factory;

import com.designpattern.creating.abstractfactory.product.Fruits;
import com.designpattern.creating.abstractfactory.product.Peach;
import com.designpattern.creating.abstractfactory.product.Seed;

/**
 * @Describe
 * 工厂具体
 * @ClassName PeachFactory
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public class PeachFactory implements Factory{
    @Override
    public Fruits create() {
        Seed seed = new Seed("桃子种子");
        Peach peach = new Peach(seed);
        peach.setWater("已浇水");
        return peach;
    }
}
