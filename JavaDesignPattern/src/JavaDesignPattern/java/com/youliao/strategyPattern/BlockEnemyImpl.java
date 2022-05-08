package com.youliao.strategyPattern;

/**
 * @Author Dali
 * @Date 2022/5/5 10:37
 * @Version 1.0
 * @Description： 实现类3-（策略3）
 */
public class BlockEnemyImpl implements IStrategy {
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
