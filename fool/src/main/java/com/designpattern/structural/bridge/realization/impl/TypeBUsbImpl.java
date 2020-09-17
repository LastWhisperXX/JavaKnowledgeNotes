package com.designpattern.structural.bridge.realization.impl;

import com.designpattern.structural.bridge.realization.USBInterface;

/**
 * @Describe
 * @ClassName TypeBUsbImpl
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public class TypeBUsbImpl implements USBInterface {
    @Override
    public String getType() {
        return "Type-B";
    }
}
