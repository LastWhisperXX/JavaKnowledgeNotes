package com.designpattern.structural.bridge.realization.impl;

import com.designpattern.structural.bridge.realization.USBInterface;

/**
 * @Describe
 * @ClassName MiniUsbImpl
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public class MiniUsbImpl implements USBInterface {
    @Override
    public String getType() {
        return "Mini";
    }
}
