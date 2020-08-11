package com.designpattern.creating.singleton;

/**
 * @Describe
 * 双重检查锁模式
 *  优点
 *   线程安全(volatile阻止指令重拍 , synchronized线程锁)
 *   保证效率
 *  缺点
 *   相对效率低
 * @ClassName DoubleCheck
 * @Author ZhuXunComputer
 * @Date 2020/8/4
 * @Version JDK1.8
 */
public class DoubleCheck {
    /**
     * volatile关键字阻止指令重排
     * 类初始化流程
     * 1.分配对象内存空间
     *  memory = allocate();
     * 2.初始化对象
     *  ctorInstance(memory);
     * 3.讲对象指向分配的内存空间
     *  instance =memory;
     */
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
