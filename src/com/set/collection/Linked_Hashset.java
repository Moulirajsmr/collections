package com.set.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hashset {
	
public static void main(String[] args) {
		
		//add(index,object), indexOf(elements), LastIndexOf(elements)-not work
		//set(index,elements), get(known index),toArray -- not work
		
		Set<Integer> m = new LinkedHashSet<>();
		m.add(2);
		m.add(4);
		m.add(6);
		m.add(8);
		
		Set<Integer> n = new LinkedHashSet<>();
		n.add(3);
		n.add(5);
		n.add(7);
		n.add(9);
		
		int size = m.size();
		System.out.println(size);
		
		boolean contains = m.contains(6);
		System.out.println(contains);
		
		String string = m.toString();
		System.out.println(string);
		
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		boolean equals = m.equals(n);
		System.out.println(equals);
		
		boolean addAll = m.addAll(n);
		System.out.println(addAll);
		System.out.println(m);
		
		boolean remove = m.remove(6);
		System.out.println(remove);
		System.out.println(m);
		
		boolean removeAll = m.removeAll(n);
		System.out.println(removeAll);
		System.out.println(m);
		
		m.clear();
		System.out.println(m);
	
	}
}
