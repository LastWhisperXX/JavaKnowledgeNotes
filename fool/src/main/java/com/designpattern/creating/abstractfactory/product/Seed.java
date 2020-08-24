package com.designpattern.creating.abstractfactory.product;

/**
 * @Describe
 * @ClassName Seed
 * @Author ZhuXunComputer
 * @Date 2020/8/24
 * @Version JDK1.8
 */
public class Seed {
    private String name ;

    public Seed (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
