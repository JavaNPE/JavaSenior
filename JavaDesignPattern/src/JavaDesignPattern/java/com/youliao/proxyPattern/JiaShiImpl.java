package com.youliao.proxyPattern;

/**
 * @Author Dali
 * @Date 2022/5/5 15:02
 * @Version 1.0
 * @Description
 */
public class JiaShiImpl implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏高抛底售");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏开开心心");
    }
}
