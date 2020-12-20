package com.xuyue.replay;

public class _7_iPlusPlus_PlusPlusi {

	public static void main(String[] args) {
		int a=1,i=0;
		a=i++;
		System.out.println(" * i++ 先赋值在运算,例如 a=i++,先赋值a=i,后运算i=i+1,所以结果是a="+a+";i="+i);
		
		int b=1,j=0;
		b=++j;
		System.out.println(" * ++i 先运算在赋值,例如 a=++i,先运算i=i+1,后赋值a=i,所以结果是a="+b+";i="+j);
	}
}
