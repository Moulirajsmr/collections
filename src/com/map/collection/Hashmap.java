package com.map.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Java");
		m.put(2, "Eclipse");
		m.put(3, null);
		m.put(null, "class");
		m.put(null, "object");
		m.put(4, "main");
		m.put(4, "interface");
		m.put(null, null);
		m.put(6, "programming");

		System.out.println(m);

		int size = m.size();
		System.out.println(size);

		boolean containsKey = m.containsKey(4);
		System.out.println(containsKey);

		boolean containsValue = m.containsValue("main");
		System.out.println(containsValue);

		boolean empty = m.isEmpty();
		System.out.println(empty);

		String string = m.get(4);
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
