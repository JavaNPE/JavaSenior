package com.youliao.strategyPattern;

import org.junit.Test;

/**
 * @Author Dali
 * @Date 2022/5/5 10:24
 * @Version 1.0
 * @Description: 策略模式：
 * 背景：
 *      刘备要到江东娶老婆了，走之前诸葛亮给赵云（伴郎）三个锦囊妙计，说是按天机拆开解决棘手问题，
 *      嘿，还别说，真是解决了大问题，搞到最后是周瑜陪了夫人又折兵呀，那咱们先看看这个场景是什么样子 的。
 * 先说这个场景中的要素：
 *      三个妙计，一个锦囊，一个赵云，妙计是小亮同志给的，妙计是放置在锦囊
 *      里，俗称就是锦囊妙计嘛，那赵云就是一个干活的人，从锦囊中取出妙计，执行，然后获胜，用 JAVA 程序
 */
public class StrategyPattern {
    /**
     * 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
     */
    @Test
    public void zhaoYun() {
        Context context;

        //刚刚到吴国的时候拆第一个
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new BackDoorImpl()); // 拿到妙计
        context.operate();  // 拆开执行
        // 刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GivenGreenLightImpl());
        context.operate();  // 执行了第二个锦囊了
        // 孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个------------ - ");
        context = new Context(new BlockEnemyImpl());
        context.operate();  // 孙夫人退兵

        /**
         *  问题来了：赵云实际不知道是那个策略呀，他只知道拆第一个锦囊， 而不知道是BackDoor这个妙计，咋办？ 似乎这个策略模式已经把计谋名称写出来了 错！BackDoor、GivenGreenLight、BlockEnemy只是一个代码，你写成first、second、
         * third，没人会说你错! 策略模式的好处就是：体现了高内聚低耦合的特性呀，缺点嘛，这个那个，我回去再查查
         */

    }
}
