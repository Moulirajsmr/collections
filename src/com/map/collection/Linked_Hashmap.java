package com.map.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Linked_Hashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> n = new LinkedHashMap<Integer, String>();

		n.put(2, "kerala");
		n.put(5, "mumbai");
		n.put(null, "tamilnadu");
		n.put(1, null);
		n.put(3, "karnataka");
		n.put(4, "goa");

		System.out.println(n);

		int size = n.size();
		System.out.println(size);

		boolean containsKey = n.containsKey(2);
		System.out.println(containsKey);

		boolean containsValue = n.containsValue("goa");
		System.out.println(containsValue);

		boolean empty = n.isEmpty();
		System.out.println(empty);

		String string = n.get(5);
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
