package com.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describe
 * 适配器模式 主机
 * @ClassName Host
 * @Author ZhuXunComputer
 * @Date 2020/9/15
 * @Version JDK1.8
 */
public class Host {
    private List<String> videoCardInterface;

    public Host (){
        this.videoCardInterface = new ArrayList<>(2);
        this.videoCardInterface.add("DVI");
        this.videoCardInterface.add("DP");
    }

    public List<String> outputSignal(){
        return this.videoCardInterface;
    }
}
