package com.designpattern.structural.bridge;

import com.designpattern.StructuralDemoInterface;
import com.designpattern.structural.bridge.realization.USBInterface;
import com.designpattern.structural.bridge.realization.impl.TypeAUsbImpl;

/**
 * @Describe
 * @ClassName BridgeDemo Qwe
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public class BridgeDemo implements StructuralDemoInterface {
    @Override
    public Object doTest() {
        USBInterface usbInterface = new TypeAUsbImpl();
        USBLine usbLine = new LangUsbLine(usbInterface);
        usbLine.getUsbLine();
        return null;
    }
}
