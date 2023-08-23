package userInput;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		//		Scanner ref = new  Scanner(System.in);
		//		System.out.println("PLs enter ATM Pin: ");
		//		// whenever u want to give integer as input 
		//		int pin=ref.nextInt();
		//		System.out.println("ATM pin is: "+pin);

		//		// when ever u want to give String as Input
		//		Scanner s1 = new Scanner(System.in);
		//		System.out.println("Pls enter your name: ");
		//		String ref = s1.next();
		//		System.out.println(ref);

		double a;
		double b;
		Scanner s2 = new Scanner(System.in);

		System.out.println("Pls enter value for a :");
		a=s2.nextDouble();
		
		System.out.println("Pls enter value for b :");
		b= s2.nextDouble();
		
		System.out.println(a+b);
		
		
		

	}

}
