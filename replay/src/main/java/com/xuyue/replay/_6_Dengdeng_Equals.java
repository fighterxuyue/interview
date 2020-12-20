package com.xuyue.replay;

/**
 * ==和equals有什么区别
 * @author Tony Xu
 *
 */
public class _6_Dengdeng_Equals {

	public static void main(String[] args) {
		System.out.println("==判断的是两个对象地址是不是相等；equals判断的是两个对象是不是相等，但equals有两种使用情况：\n"
				+ "1.类没有覆盖equals方法：这种等同于==；\n"
				+ "2.类覆盖了equals方法：一般是比较内容是不是相等，相等返回true");
	}
}
