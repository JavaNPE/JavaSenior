package com.youliao.strategyPattern;

/**
 * @Author Dali
 * @Date 2022/5/5 10:40
 * @Version 1.0
 * @Description： 三个实现类我们是有了，怎么使用那三个实现类（锦囊妙计）呢？
 *      好了，大家看看，三个妙计是有了，那需要有个地方放这些妙计呀，放锦囊呀：
 */
public class Context {
    // 构造函数，确定使用哪个锦囊妙计
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    // 使用三种锦囊策略
    public void operate() {
        this.iStrategy.operate();
    }
}
