package com.Alist;

import java.util.ArrayList;

public class Demo4 
{

	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("pune");
		a1.add("delhi");
		a1.add("hyd");
		a1.add("mumbai");
		a1.add("blr");
		a1.add("mumbai");


		int count = 0;
		for (int i = 0; i < a1.size(); i++)
		{
			String temp=a1.get(i);

			if(temp.equalsIgnoreCase("mumbai")) 
			{
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println(count);
		
		



	}

}
