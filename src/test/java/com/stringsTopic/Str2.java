package com.stringsTopic;

public class Str2 {

	public static void main(String[] args) {
		
		String str= "Maharashtra";
		
		System.out.println(str);
		
		String rev="";
		
		System.out.println(rev.isEmpty());
		
		System.out.println(str.isEmpty()); //true
		
		System.out.println(str.length()); //11
		
		System.out.println(str.charAt(10));
		
		System.out.println(str.startsWith("Mah"));
		
		System.out.println(str.endsWith("tra"));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		
		System.out.println(str.replace('a', 'z'));
		
		System.out.println(str.replace("Maha", "Raha"));
		
		System.out.println(str.substring(4));
		
		System.out.println(str.substring(0, 4));
		
		

	}

}
