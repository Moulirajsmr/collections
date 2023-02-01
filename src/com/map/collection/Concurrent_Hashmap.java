package com.map.collection;

import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Hashmap {
	
	public static void main(String[] args) {
				
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();
		
		m.put(0, "zero");
		m.put(1, "one");
		m.put(2, "too");
		m.put(3,"three");
		m.put(4, "four");
		m.put(2, "two");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		boolean containsKey = m.containsKey(2);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("too");
		System.out.println(containsValue);
		
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		String string = m.get(1);
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
