package com.designpattern.structural.bridge.realization.impl;

import com.designpattern.structural.bridge.realization.USBInterface;

/**
 * @Describe
 * @ClassName TypeA_USB
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public class TypeAUsbImpl implements USBInterface {
    @Override
    public String getType() {
        return "Type-A";
    }
}
