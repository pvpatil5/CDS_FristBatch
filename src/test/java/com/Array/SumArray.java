package com.Array;

public class SumArray {

	public static void main(String[] args) {

		int arr[]= {87,68,79,88,99};
		int sum=1;

		for (int i = 0; i < arr.length; i++)
		{
			sum=sum*arr[i];
		}
		System.out.println(sum);
	}

}
