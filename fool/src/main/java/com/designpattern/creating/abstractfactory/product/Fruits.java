package com.designpattern.creating.abstractfactory.product;

/**
 * @Describe
 * @ClassName Fruits
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public abstract class Fruits {
    private String water = "未浇水";

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    /**
     * 获取信息
     */
    public abstract void getInfo();
}
