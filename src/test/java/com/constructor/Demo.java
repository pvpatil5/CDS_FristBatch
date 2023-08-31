package com.constructor;

public class Demo
{

//	int a = 5;
//	int b = 10;
//	static String name = "Pavan";
	
	// How to declare a constructor ?
	// 1. class name should be constructor name
	// 2. It should not have return type
	// 3. Every class has default constructor
	
	//Whenever you are ceating object that time constructor execution will happen
	
	
	public String add() {
		System.out.println("add ");
		return "pune";
	}
	
	public int add(int a) {
		System.out.println(a);
		return 5;
	}
	
	
	
	String s1 = "abc@$1k22h3";
	
	
	
	public Demo(String name) 
	{
		System.out.println("Executing constructor from Demo...");
		System.out.println(name);
	}
	
	public Demo(String name,int a, String ref) 
	{
		System.out.println("Executing constructor from Demo...");
		System.out.println(name);
	}
	
	
	public Demo(int a, String name) 
	{
		System.out.println("Executing constructor from Demo int argument...");
		System.out.println(a+" "+name);
	}
	
	public Demo() {
		System.out.println("Executing constructor from Demo non argument...");
	}
	
	public static void main(String[] args) {
		Demo d2 = new Demo();
		
		
		
		d2.add();
		d2.add(10);
		
		System.out.printf("%-15s%03d%n");
		
		
	}
	
	
	
	
	
}
