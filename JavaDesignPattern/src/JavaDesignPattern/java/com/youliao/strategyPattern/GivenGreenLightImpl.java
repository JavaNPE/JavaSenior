package com.youliao.strategyPattern;

/**
 * @Author Dali
 * @Date 2022/5/5 10:35
 * @Version 1.0
 * @Description: 实现类2-（第二个锦囊妙计）
 */
public class GivenGreenLightImpl implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
