package com.designpattern.creating.singleton;

import com.designpattern.CreatingDemoInterface;

/**
 * @Describe 单例模式测试
 * @ClassName SingletonDemo
 * @Author ZhuXunComputer
 * @Date 2020/7/28
 * @Version JDK1.8
 */
public class SingletonDemo implements CreatingDemoInterface {

    /**
     * 单例组
     * @return
     */
    @Override
    public StaticInside doTest(){
        StaticInside lazy = StaticInside.getInstance();
        return lazy;
    }

    /**
     * 对照组
     * @return
     */
    @Override
    public Contrast doContrast(){
        Contrast contrast = new Contrast();
        return contrast;
    }

}
