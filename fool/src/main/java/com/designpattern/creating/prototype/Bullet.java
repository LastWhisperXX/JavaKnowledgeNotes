package com.designpattern.creating.prototype;

/**
 * @Descripton
 *  子弹类
 *  原型对象的引用数据类型，用以验证对象深拷贝
 * @Classname Bullet
 * @Author CaoYang
 * @Address 开发大道
 * @Date 2020/8/19 23:22
 * @Version 1.8.0
 * @Createder by 寒酥
 */
public class Bullet implements Cloneable{
    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet)super.clone();
    }
}
