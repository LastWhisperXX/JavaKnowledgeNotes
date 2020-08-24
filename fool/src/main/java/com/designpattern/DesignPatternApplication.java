package com.designpattern;

import com.designpattern.creating.abstractfactory.AbstractFactoryDemo;
import com.designpattern.creating.singleton.SingletonDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZhuXunComputer
 */
@SpringBootApplication
public class DesignPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class,args);
        //SingletonDemo singletonDemo = new SingletonDemo();
        //System.out.println(singletonDemo.doTest() == singletonDemo.doTest());
        //System.out.println(singletonDemo.doContrast() == singletonDemo.doContrast());
        AbstractFactoryDemo abstractFactoryDemo = new AbstractFactoryDemo();
        abstractFactoryDemo.doContrast();
        abstractFactoryDemo.doTest();
    }
}
