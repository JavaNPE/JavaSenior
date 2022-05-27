package com.youliao.proxyPattern;

/**
 * @Author Dali
 * @Date 2022/5/5 14:30
 * @Version 1.0
 * @Description: 定义王婆，江湖媒婆。
 */
public class WangPoImpl implements KindWomen {

    private KindWomen kindWomen;

    // 默认的话，王婆是潘金莲的代理。
    public WangPoImpl() {
        this.kindWomen = new PanJinLianImpl();
    }

    // 王婆可以是KindWomen的任何一个women的代理，只要你是这一类型
    public WangPoImpl(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    public void makeEyesWithMan() {
        // wangpo自己年纪大了，可以指代一个同类型的women
        this.kindWomen.makeEyesWithMan();
    }

    public void happyWithMan() {
        // wangpo指定某个women
        this.kindWomen.happyWithMan();
    }
}
