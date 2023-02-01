package com.map.collection;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Tree_Map {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> m = new TreeMap<>();
		
		m.put(4, "SBI");
		m.put(2, "Axis");
		m.put(1, null);
		m.put(0, "Indian");
		m.put(3, "ICICI");
		m.put(1, "Federal");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		boolean containsKey = m.containsKey(4);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("sbi");
		System.out.println(containsValue);
		
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		String string = m.get(2);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		m.clear();
		System.out.println(m);
	}

}
