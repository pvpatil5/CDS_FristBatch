package com.Maps;

import java.util.HashMap;
import java.util.Map;

public class Demo1 
{
	// when ever u r saveing u r data in the form key and value pair
	
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap();
		m1.put(1, "Amit");
		m1.put(12, "Rahul");
		m1.put(31, "dynandev");
		m1.put(44, "shital");	
		System.out.println(m1);
		
		System.out.println("================================================");
		Map<Character, String> m2 = new HashMap();
		m2.put('K', "Amit");
		m2.put('N', "Rahul");
		m2.put('k', "dynandev");
		m2.put('j', "shital");
		
		System.out.println(m2);
		
	}
}
