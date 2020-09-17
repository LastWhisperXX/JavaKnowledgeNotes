package com.designpattern.structural.adapter;

/**
 * @Describe
 * @ClassName Player
 * @Author ZhuXunComputer
 * @Date 2020/9/15
 * @Version JDK1.8
 */
public class Player {

    public void useComputer(){
        Host host = new Host();

        Monitor monitor = new Monitor();

        System.out.println(monitor.inputSignal(host.outputSignal()));

        TransferInterface transferInterface = new TransferInterface();

        System.out.println(monitor.inputSignal(transferInterface.DIVtoVGA(host.outputSignal())));
    }

}
