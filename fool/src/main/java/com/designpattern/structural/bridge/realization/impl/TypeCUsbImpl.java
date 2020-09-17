package com.designpattern.structural.bridge.realization.impl;

import com.designpattern.structural.bridge.realization.USBInterface;

/**
 * @Describe
 * @ClassName TypeCUsbImpl
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public class TypeCUsbImpl implements USBInterface {
    @Override
    public String getType() {
        return "Type-C";
    }
}
