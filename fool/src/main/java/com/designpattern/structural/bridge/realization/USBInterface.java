package com.designpattern.structural.bridge.realization;

/**
 * @Describe
 * @ClassName USBInterface
 * @Author ZhuXunComputer
 * @Date 2020/9/16
 * @Version JDK1.8
 */
public interface USBInterface {
    /**
     * 声明并返回USB接口类型
     * @return 接口类型
     */
    String getType();
}
