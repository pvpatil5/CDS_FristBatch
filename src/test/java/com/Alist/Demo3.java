package com.Alist;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {

		String arr[]= {"5","45","3","2"};

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) 
		{
			a1.add(Integer.parseInt(arr[i]));	
		}

		System.out.println(a1);
	}

}
