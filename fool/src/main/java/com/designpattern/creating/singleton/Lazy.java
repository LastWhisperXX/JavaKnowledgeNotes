package com.designpattern.creating.singleton;

/**
 * @Describe
 * 单例模式——懒汉式
 * 优点
 *  1.最基础的实现方式
 *  2.不需要线程共享
 *  3.不需要锁
 *  4.性能良好
 * 缺点
 *  线程不安全
 *
 * @ClassName Lazy
 * @Author ZhuXunComputer
 * @Date 2020/7/28
 * @Version JDK1.8
 */
public class Lazy {
    private static Lazy lazy;

    private Lazy (){ }

    public static Lazy getInstance(){
        if(lazy == null){
             lazy = new Lazy();
        }
        return lazy;
    }
}
