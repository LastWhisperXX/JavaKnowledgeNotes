package com.designpattern.creating.singleton;

/**
 * @Describe 单例模式测试
 * @ClassName SingletonDemo
 * @Author ZhuXunComputer
 * @Date 2020/7/28
 * @Version JDK1.8
 */
public class SingletonDemo {

    public StaticInside doTest(){
        StaticInside lazy = StaticInside.getInstance();
        return lazy;
    }

    public Contrast doContrast(){
        Contrast contrast = new Contrast();
        return contrast;
    }

}
