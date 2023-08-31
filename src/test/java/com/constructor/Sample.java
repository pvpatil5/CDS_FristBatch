package com.constructor;

public class Sample 
{
//	static {
//		System.out.println("Executing static block...");
//	}

	public  static void add() {
		System.out.println("Executing static method...");
	}

	public void sub() {
		
		System.out.println("Executing non static method...");
	}

	public Sample() {
		System.out.println("constructor execution sample ");
		
	}
	
//	{
//		System.out.println("non static block");
//	}
	


}
