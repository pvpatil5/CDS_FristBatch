package com.Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[]= {87,68,79,88,99};
		//68 79 87 88 99
		
		System.out.println("Before sorting Array=");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("Array after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("sorting in descending=");
		for (int i = arr.length-1; i >=0; i--) 
		{
		System.out.println(arr[i]);	
		}
		

	}

}
