package com.designpattern.structural.adapter;

import com.designpattern.StructuralDemoInterface;

/**
 * @Describe
 * @ClassName AdapterDemo
 * @Author ZhuXunComputer
 * @Date 2020/9/15
 * @Version JDK1.8
 */
public class AdapterDemo implements StructuralDemoInterface {
    @Override
    public Object doTest() {
        Player player = new Player();
        player.useComputer();
        return null;
    }
}
