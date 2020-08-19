package com.designpattern.creating.prototype;

import com.designpattern.CreatingDemoInterface;

/**
 * @Descripton
 * 原型模式测试类
 * @Classname PrototypeDemo
 * @Author CaoYang
 * @Address 开发大道
 * @Date 2020/8/19 23:34
 * @Version 1.8.0
 * @Createder by 寒酥
 */
public class PrototypeDemo implements CreatingDemoInterface {

    @Override
    public Object doTest() {
        try {
            EnemyPlane.getInstance(2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object doContrast() {
        return null;
    }
}
