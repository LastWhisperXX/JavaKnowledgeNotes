package com.designpattern.creating.abstractfactory.product;

/**
 * @Describe
 * 产品具体
 * @ClassName Apple
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public class Apple extends Fruits{
    private Seed seed;
    private String water;

    public Apple(Seed seed){
        this.seed = seed;
        this.water = super.getWater();
    }

    public Seed getSeed() {
        return seed;
    }

    public void setSeed(Seed seed) {
        this.seed = seed;
    }

    @Override
    public void getInfo() {
        System.out.println("苹果树");
        System.out.println("浇水：" + this.water);
        System.out.println("种子：" + this.seed.getName());
    }
}
