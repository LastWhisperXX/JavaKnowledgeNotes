package com.designpattern.creating.builder;

import com.designpattern.CreatingDemoInterface;

/**
 * @Describe
 * 建造者模式测试
 * @ClassName BuilderDemo
 * @Author ZhuXunComputer
 * @Date 2020/8/27
 * @Version JDK1.8
 */
public class BuilderDemo implements CreatingDemoInterface {
    @Override
    public Object doTest() {
        BubbleTea bubbleTea = new BubbleTea.Builder("大杯").setIce("加冰").setPearl("加珍珠").build();
        System.out.println(bubbleTea);
        return null;
    }

    @Override
    public Object doContrast() {
        BubbleTea bubbleTea = new BubbleTea.Builder("中杯").setIce("加热").setPearl("无珍珠").setNata("加椰果").build();
        System.out.println(bubbleTea);
        return null;
    }
}
