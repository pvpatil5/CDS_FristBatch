package com.Maps;

import java.util.HashMap;
import java.util.Map;

public class Demo2 
{
	// when ever u r saveing u r data in the form key and value pair
	// Duplicate keys are not allowed
	// duplicate values are allowed
	
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap();
		m1.put(1, "Amit");
		m1.put(12, "Rahul");
		m1.put(31, "dynandev");
		m1.put(44, "shital");	
		m1.put(12, "vipul");
		m1.put(3, "saurabh");
		m1.put(4, "saurabh");
		
		System.out.println(m1);
		
		
		
	}
}
