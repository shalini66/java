package com.capgemini.javafullstack.map;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestE {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("PineApple", 40);
		hm.put("Apple", 50);
		hm.put("Grapes", 90);
		hm.put("Banana", 10);
		
		Collection<Integer> cs = hm.values();
		Iterator<Integer> it = cs.iterator();
		
		boolean b = hm.containsKey("Banana");
		System.out.println(b);
		
		boolean g = hm.containsValue(8);
		System.out.println(g);
		
		Integer i = hm.get("Banana");
		System.out.println(i);
	}
}
