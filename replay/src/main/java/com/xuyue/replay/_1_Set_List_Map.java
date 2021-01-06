package com.xuyue.replay;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Set,List和Map的区别
 * @author Tony Xu
 *
 */
public class _1_Set_List_Map {

    public static void main(String[] args) {
    	//List中的元素有序，可以重复
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("c");
		for (String string : list) {
			System.out.println("List："+string);
		}
		
		System.out.println("============================================");
		
		//Set不允许有重复元素
		Set<String> hashSet=new HashSet<String>();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("a");
		hashSet.add("d");
		hashSet.add("c");
		for (String string : hashSet) {
			System.out.println("HashSet："+string);
		}

		System.out.println("============================================");
		
		//Map是key,value键值对存储结构，key不允许重复
		Map<String,String> hashMap=new HashMap<String,String>();
		hashMap.put("a", "1");
		hashMap.put("b", "2");
		hashMap.put("a", "3");
		for (String string : hashMap.keySet()) {
			System.out.println("HashMap："+string+"-->"+hashMap.get(string));
		}
	}
}
