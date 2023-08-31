package com.constructor;

public class SingleTon 
{
	 String name ="pune";
	
	private SingleTon() {
		System.out.println("Executing constrictor from singleton class");
	}

	private void display() {
		System.out.println("Non Static Method from Singleton class");
	}

	public static void readDisplay() {
		SingleTon s1 = new SingleTon();
		s1.display();
	}
}
