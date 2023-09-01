package com.Alist;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		
		int arr[]= {5,3,6,9,10,2,4};
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++)
		{
			a1.add(arr[i]);
		}
		System.out.println(a1);
		
		

	}

}
