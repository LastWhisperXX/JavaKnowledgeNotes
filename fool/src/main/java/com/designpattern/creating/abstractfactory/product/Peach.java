package com.designpattern.creating.abstractfactory.product;

/**
 * @Describe
 * @ClassName Peach
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public class Peach extends Fruits{

    private String water;
    private Seed seed;

    public Peach (Seed seed){
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
        System.out.println("桃子树");
        System.out.println("浇水：" + this.water);
        System.out.println("种子：" + this.seed.getName());
    }
}
