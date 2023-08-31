package com.constructor;

public class Constructor_1 extends Demo
{

	// Declaration
	int a;
	String str;

	// Argument constructor
	private Constructor_1(int k,String l) 
	{
		// Initialization
		super();
		a=k;
		str=l;
		System.out.println("executing from class 1="+a+"\n"+str);
	}
	
	public void display() {
		System.out.println(a+"\n"+str);
	}


}
