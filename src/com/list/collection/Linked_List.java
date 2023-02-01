package com.list.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(20);
		l.add(40);
		l.add(60);
		l.add(80);
		System.out.println(l);
		
		l.add(2, 50);
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		int indexOf = l.indexOf(50);
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf(60);
		System.out.println(lastIndexOf);
		
		boolean contains = l.contains(80);
		System.out.println(contains);
		
		Integer integer = l.get(3);
		System.out.println(integer);
		
		l.set(3, 80);
		System.out.println(l);
		
		List<Integer> p = new LinkedList<Integer>();
		p.add(10);
		p.add(50);
		p.add(30);
		p.add(70);
		System.out.println(p);
		
		boolean retainAll = l.retainAll(p);
		System.out.println(retainAll);
		
		boolean empty = p.isEmpty();
		System.out.println(empty);
		
		boolean equals = p.equals(l);
		System.out.println(equals);
		
		Collections.sort(p);
		System.out.println(p);
		
		Object[] array = p.toArray();
		for (Object Object : array)
		System.out.println(Object);
		
		String string = p.toString();
		System.out.println(string);
		
	}
}
