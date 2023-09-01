package com.Alist;

import java.util.ArrayList;

public class Demo6 
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

		System.out.println(a1.get(4));

		a1.set(5, "surat");

		System.out.println(a1);

	}

}
