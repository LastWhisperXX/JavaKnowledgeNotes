package com.designpattern.creating.singleton;

/**
 * @Describe 双重检查锁模式
 * @ClassName DoubleCheck
 * @Author ZhuXunComputer
 * @Date 2020/8/4
 * @Version JDK1.8
 */
public class DoubleCheck {
    private static volatile DoubleCheck doubleCheck ;

    private DoubleCheck(){};

    public static DoubleCheck getInstance(){
        if(doubleCheck == null){
            synchronized (DoubleCheck.class){
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
