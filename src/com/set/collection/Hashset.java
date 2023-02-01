package com.set.collection;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
	
	public static void main(String[] args) {
		//add(index,object), indexOf(elements), LastIndexOf(elements)-not work
		//set(index,elements), get(known index)- not work
			
			Set<Integer> m = new HashSet<Integer>();		
			m.add(30);
			m.add(40);
			m.add(60);
			m.add(80);
			System.out.println(m);
			
			Set<Integer> n = new HashSet<Integer>();		
			n.add(10);
			n.add(30);
			n.add(50);
			n.add(60);
			System.out.println(n);
			
			int size = m.size();
			System.out.println(size);
			
			m.add(100);
			System.out.println(m);
			
			boolean contains = m.contains(50);
			System.out.println(contains);
			
			boolean addAll = m.addAll(n);
			System.out.println(addAll);
			System.out.println(m);
			
			boolean empty = m.isEmpty();
			System.out.println(empty);
			
			boolean equals = m.equals(n);
			System.out.println(equals);
			
			boolean retainAll = m.retainAll(n);
			System.out.println(retainAll);
			System.out.println(m);
			System.out.println("-------");
			
			Object[] array = m.toArray();
			for (Object Object : array)
			System.out.println(Object);
			
			String string = m.toString();
			System.out.println(string);
			System.out.println("------");
			
			boolean remove = m.remove(60);
			System.out.println(m);
			
			boolean removeAll = m.removeAll(n);
			System.out.println(m);
			
			m.clear();
			System.out.println(m);
	}
}
