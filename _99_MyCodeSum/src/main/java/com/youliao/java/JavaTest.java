package com.youliao.java;

import org.junit.Test;

/**
 * @Author Dali
 * @Date 2021/12/23 15:16
 * @Version 1.0
 * @Description
 */
public class JavaTest {
	/**
	 * Integer.parseInt()什么意思？
	 * java中的语句integer.parseint（)是将整型数据Integer转换为基本数据类型int
	 */
	@Test
	public void testIntegerParseInt() {
		String str = "2";
		int i = Integer.parseInt(str);
		System.out.println(i + 1);
		System.out.println(str + 1);

	}
	public static enum MessageDirection {
		SEND(1),
		RECEIVE(2);
	}

	/**
	 *
	 */
	@Test
	public void  testEnum() {

	}
}