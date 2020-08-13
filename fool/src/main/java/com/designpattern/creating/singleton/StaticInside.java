package com.designpattern.creating.singleton;

/**
 * @Descripton
 * 静态内部类
 *  优点
 *   利用JVM实现线程安全
 *   节省资源
 *  缺点
 *
 * @Classname StaticInside
 * @Author CaoYang
 * @Address 开发大道
 * @Date 2020/8/11 23:47
 * @Version 1.8.0
 * @Createder by 寒酥
 */
public class StaticInside {
    private static class Inside{
        private static final StaticInside INSIDE = new StaticInside();
    }
    private StaticInside(){}

    public static StaticInside getInstance(){
        return Inside.INSIDE;
    }
}
