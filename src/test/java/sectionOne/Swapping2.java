package sectionOne;

public class Swapping2 {

	// Swapping of 2 variables without using 3rd variable
	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		//b -->10 a-->20
		
		a=a+b ;// a=a+b ===> 10+20
		System.out.println("New value of a="+a);
		//System.out.println("value of b="+b);
		 
		b= a-b; //30-20=10
		System.out.println("New value of b ="+b);
		System.out.println("Value of a on this line="+a);
		
		a= a-b;// 30-10=20
		System.out.println("LAst value of a="+a);
	
	}

}
