package com.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3 
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
		
	//	System.out.println(m1);
		
		Set itr = m1.entrySet();
		Iterator i1 = itr.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
//			Entry<Integer, String> e1 = (Entry<Integer, String>) i1.next();
//			System.out.println(e1.getKey()+" "+e1.getValue());
		}
		
		
	}
}
