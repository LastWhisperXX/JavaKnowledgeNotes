package com.designpattern;

/**
 * @Descripton
 * 创建型模式结果验证接口
 * @Classname DemoInterface
 * @Author CaoYang
 * @Address 开发大道
 * @Date 2020/8/19 23:37
 * @Version 1.8.0
 * @Createder by 寒酥
 */
public interface CreatingDemoInterface {

    /**
     * 模式验证
     * @return 模式对象
     */
    Object doTest();

    /**
     * 结果对照组
     * @return 对照对象
     */
    Object doContrast();
}
