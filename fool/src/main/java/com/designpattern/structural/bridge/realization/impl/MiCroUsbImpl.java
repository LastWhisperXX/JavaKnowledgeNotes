package com.designpattern.structural.bridge.realization.impl;

import com.designpattern.structural.bridge.realization.USBInterface;

/**
 * @Describe
 * @ClassName MinCroUsbImpl
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public class MiCroUsbImpl implements USBInterface {
    @Override
    public String getType() {
        return "Micro";
    }
}
