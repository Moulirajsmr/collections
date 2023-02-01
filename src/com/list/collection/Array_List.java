package com.list.collection;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(150);
		l.add(200);
		l.add(250);		
		System.out.println(l);
		
		l.add(3, 150);		
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		int indexOf = l.indexOf(200);
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf(150);
		System.out.println(lastIndexOf);
		
		boolean contains = l.contains(250);
		System.out.println(contains);
		
		Integer integer = l.get(3);
		System.out.println(integer);
		
		l.set(3, 500);
		l.set(4, 100);
		System.out.println(l);
		System.out.println("---------------");
		
		List<Integer> p = new ArrayList<Integer>();
		p.add(10);
		p.add(100);
		p.add(50);
		p.add(150);		
		System.out.println(p);
		
		boolean retainAll = l.retainAll(p);
		System.out.println(retainAll);
		
		boolean addAll = l.addAll(p);
		System.out.println(addAll);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		boolean equals = l.equals(p);
		System.out.println(equals);
		
		p.sort(null);
		System.out.println(p);
		
		Object[] array = l.toArray();
		for (Object Object : array)
		System.out.println(Object);
		
		String string = l.toString();
		System.out.println(string);
		
		System.out.println("-------");
		
		l.remove(2);
		System.out.println(l);
		
		l.removeAll(l);
		System.out.println(l);
	}

}
