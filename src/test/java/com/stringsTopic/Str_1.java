package com.stringsTopic;

public class Str_1 
{

	public static void main(String[] args) {
	
		// not using new operator
		String s1= "pune";
		
		// using new operator
		String s2 = new String("pune");
		
		String s3 = "Pune";
		
		String s4= new String("pune");
		
		// compare address
		// ==
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s3); 
		
		System.out.println(s2==s4);
		
		System.out.println("========================");
	
		// compare content
		// .equals
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		
		
		
	}
}
