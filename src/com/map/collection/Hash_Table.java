package com.map.collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

public class Hash_Table {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> n = new Hashtable<>();
		
		n.put(0, "asia");
		n.put(1, "africa");
		n.put(2, "europe");
		n.put(3, "north-america");
		n.put(4, "south-america");
		
		System.out.println(n);
		
		int size = n.size();
		System.out.println(size);
		
		boolean containsKey = n.containsKey(2);
		System.out.println(containsKey);
		
		boolean containsValue = n.containsValue("asia");
		System.out.println(containsValue);
		
		boolean empty = n.isEmpty();
		System.out.println(empty);
		
		String string = n.get(1);
		System.out.println(string);
		
		Set<Integer> keySet = n.keySet();
		System.out.println(keySet);
		
		Collection<String> values = n.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = n.entrySet();
		System.out.println(entrySet);
		
		n.clear();
		System.out.println(n);
	}

}
