package com.designpattern.structural.bridge;

import com.designpattern.structural.bridge.realization.USBInterface;

/**
 * @Describe
 * @ClassName USBLine
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public abstract class USBLine {
    protected USBInterface usbInterface;

    public USBLine(USBInterface usbInterface) {
        this.usbInterface = usbInterface;
    }

    /**
     * 获取USB数据线
     */
    public abstract void getUsbLine();

}
