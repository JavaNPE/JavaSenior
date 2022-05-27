package com.youliao.proxyPattern;

/**
 * @Author Dali
 * @Date 2022/5/5 14:19
 * @Version 1.0
 * @Description： 定义一种类型的women，定义一种类型的女人，比如，王婆和潘金莲都属于这个类型的女人
 * 一般一种类型定义一种接口。这是统一类型的women。
 */
public interface KindWomen {

    //这种类型的女人能做什么事情呢？
    public void makeEyesWithMan(); //抛媚眼

    public void happyWithMan(); //happy what? You know that!
}
