package com.designpattern.creating.singleton;

/**
 * @Descripton
 * 枚举式
 *  优点
 *   无需特殊操作，默认枚举实例的创建是线程安全的，并且在任何情况下都是单例
 *  缺点
 *   过于简单导致代码可读性下降
 *   不支持LazyLoad
 * @Classname EnumSingleton
 * @Author CaoYang
 * @Address 开发大道
 * @Date 2020/8/12 23:35
 * @Version 1.8.0
 * @Createder by 寒酥
 */
public enum EnumSingleton {
    INSTANCE;

    /**
     * 隐式实现
     * @return
     */
    public static EnumSingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }
}
