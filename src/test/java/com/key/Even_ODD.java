package com.key;

public class Even_ODD {

	public static void main(String[] args) {

		// "/" --> Quo
		// "%" --> remainder
		// Even --> if remainder is zero then number is even
		// odd --> if remainder is 1 then number is odd

//		int number = 11;
//		
//		if(number%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
//		
//		System.out.println("===========================================");
//		
//		for (int i = 0; i < 101; i++) 
//		{
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}
//			
//		}
//		System.out.println();
//		System.out.println("=======================================");
//		
//		for (int i = 0; i < 101; i++) 
//		{
//			if(i%2==1) {
//				System.out.print(i+" ");
//			}
//		}
//		System.out.println();
//		System.out.println("==============================================");

		int i=1;
		while(i<100) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
			
			i++;
		}
		

	}


}
