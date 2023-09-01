package com.Alist;

import java.util.ArrayList;
import java.util.Collections;

public class Demo5 
{

	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("pune");
		a1.add("delhi");
		a1.add("hyd");
		a1.add("mumbai");
		a1.add("blr");
		a1.add("chennai");

		Collections.sort(a1);
		
		System.out.println(a1);
		
		System.out.println("================================================");
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(6);
		a2.add(4);
		a2.add(5);
		a2.add(56);
		a2.add(2);

		Collections.sort(a2);
		
		System.out.println(a2);
		
	}

}
