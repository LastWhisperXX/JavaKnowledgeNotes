package com.designpattern.structural.bridge;

import com.designpattern.structural.bridge.realization.USBInterface;

/**
 * @Describe
 * @ClassName ShortUsbLine
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public class ShortUsbLine extends USBLine{
    public ShortUsbLine(USBInterface usbInterface) {
        super(usbInterface);
    }

    @Override
    public void getUsbLine() {
        System.out.println("获得 短款 " + this.usbInterface.getType()+ " USB接口");
    }
}
