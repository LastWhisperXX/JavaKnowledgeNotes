package com.designpattern.creating.singleton;

/**
 * @Describe
 * 单例模式——饿汉式
 *  不支持LazyLoad
 *  优点
 *   线程安全
 *  缺点
 *   浪费内存
 *   类加载时就初始化
 * @ClassName Hungry
 * @Author ZhuXunComputer
 * @Date 2020/7/28
 * @Version JDK1.8
 */ 
public class Hungry {

    private static Hungry hungry = new Hungry();

    private Hungry(){ }

    public static Hungry getInstance(){
        return hungry;
    }

}
