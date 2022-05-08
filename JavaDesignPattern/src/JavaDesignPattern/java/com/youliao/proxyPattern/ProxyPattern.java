package com.youliao.proxyPattern;

import org.junit.Test;

/**
 * @Author Dali
 * @Date 2022/5/5 14:54
 * @Version 1.0
 * @Description
 */
public class ProxyPattern {
    @Test
    public void XiMenQingTest() {
        // 西门庆一来先把王婆叫出来
        WangPoImpl wangPo = new WangPoImpl();
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }

    @Test
    public void XiMenQingTest2() {
        //改编一下历史，贾氏被西门庆勾走：
        JiaShiImpl jiaShi = new JiaShiImpl();
        WangPoImpl wangPo = new WangPoImpl(jiaShi);
        wangPo.happyWithMan();
        wangPo.makeEyesWithMan();
    }
}
