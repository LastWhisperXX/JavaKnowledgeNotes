package com.designpattern;

import com.designpattern.creating.builder.BuilderDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZhuXunComputer
 */
@SpringBootApplication
public class DesignPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class,args);
        CreatingDemoInterface creatingDemo = new BuilderDemo();
        creatingDemo.doContrast();
        creatingDemo.doTest();
    }
}
