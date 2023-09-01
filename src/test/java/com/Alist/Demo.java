package com.Alist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(56);
		a1.add(6);
		a1.add(5);
		a1.add(56);
		a1.add(57);
		
		System.out.println(a1);
		//[56, 6, 5, 56, 57]
		// Duplicates are allowed
		// output ordered
		System.out.println("***********************************************");
		Set<Integer> a2 = new HashSet<Integer>();
		a2.add(78);
		a2.add(55);
		a2.add(33);
		a2.add(55);
		a2.add(32);
		
		System.out.println(a2);
		// [32, 33, 55, 78]
		// Duplicated are not allowed
		// output is not ordered
		

	}

}
