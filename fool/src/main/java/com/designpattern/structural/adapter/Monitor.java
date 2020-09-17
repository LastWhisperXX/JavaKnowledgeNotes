package com.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Describe
 * 适配器模式 显示器
 * @ClassName Monitor
 * @Author ZhuXunComputer
 * @Date 2020/9/15
 * @Version JDK1.8
 */
public class Monitor {
    private List<String> videoCardInterface;

    public Monitor (){
        this.videoCardInterface = new ArrayList<>(2);
        this.videoCardInterface.add("VGA");
        this.videoCardInterface.add("HDMI");
    }

    public String inputSignal(List<String> videoCardInterface){
        if(!Collections.disjoint(this.videoCardInterface,videoCardInterface)){
            return "接口匹配成功，展示图像信息";
        }else{
            return "接口匹配失败。";
        }
    }
}
