package com.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describe
 * @ClassName TransferInterface
 * @Author ZhuXunComputer
 * @Date 2020/9/15
 * @Version JDK1.8
 */
public class TransferInterface {
    /**
     * DVI转VGA
     * @param videoCardInterface 输入接口
     * @return 输出接口
     */
    public List<String> DIVtoVGA(List<String> videoCardInterface){
        List<String> graphicsInterface = new ArrayList<>(1);
        graphicsInterface.add("VGA");
        return videoCardInterface.contains("DVI") ? graphicsInterface : null;
    }

    /**
     * DP转HDMI
     * @param videoCardInterface 输入接口
     * @return 输出接口
     */
    public List<String> DPtoHDMI(List<String> videoCardInterface){
        List<String> graphicsInterface = new ArrayList<>(1);
        graphicsInterface.add("HDMI");
        return videoCardInterface.contains("DP") ? graphicsInterface : null;
    }
}
