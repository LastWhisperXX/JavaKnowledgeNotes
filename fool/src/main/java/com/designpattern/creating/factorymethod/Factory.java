package com.designpattern.creating.factorymethod;

/**
 * @Describe
 * @ClassName Factory
 * @Author ZhuXunComputer
 * @Date 2020/8/17
 * @Version JDK1.8
 */
public interface Factory {
    /**
     * 创建工厂
     * @return
     */
    Fruits create();
}
