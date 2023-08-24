package com.Array;

public class Demo {

	public static void main(String[] args) {
		//	What is an Array ?
		//	-->	if I want to have multiple data inside same variable i will use array.
		// --> Data should be homogeneous	(Single type)

		int[] arr= {5,3,35,8,9,4};
		int ar[]= {44,33,55,88,77,99};

		int a[]= new int[8]; // creating array with memory size 5
		a[0]=71;
		a[1]=72;
		a[2]=73;
		a[3]=38;
		a[4]=39;
		a[5]=55;

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);	
		}


	}

}
