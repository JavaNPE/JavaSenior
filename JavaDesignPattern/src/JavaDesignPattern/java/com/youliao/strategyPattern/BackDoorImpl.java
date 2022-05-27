package com.youliao.strategyPattern;

/**
 * @Author Dali
 * @Date 2022/5/5 10:33
 * @Version 1.0
 * @Description: 三个妙计，我们就写三个实现类。实现类1：找乔国老帮忙，使孙权不能杀刘备
 */
public class BackDoorImpl implements IStrategy {
    public void operate() {
        System.out.println("找乔国老帮忙，使孙权不能杀刘备!");
    }
}
