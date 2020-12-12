package com.xuyue.replay;

/**
 * Mybatis中#{}和${}有什么区别
 * @author Tony Xu
 *
 */
public class _4_Mybatis_Jing_MeiYuan {

	public static void main(String[] args) {
		System.out.println("${}属于静态文本替换，无法防止sql注入；#{}是占位符替换，能有效防止sql注入");
	}
}
