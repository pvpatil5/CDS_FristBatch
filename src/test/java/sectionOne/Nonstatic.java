package sectionOne;

public class Nonstatic
{
	// if u don't declare static keyword in front of member then it will be treated as non static
	static int runs=300;



	// what are different thinngs that can consider as non static ?
	// data memebers
	int overs =50;

	String country = "India";

	long totalruns= 525;

	// methods
	public void addition() {
		int a =30;
		int b =70;
		System.out.println("addition started");
	}

	public static void subtract() {
		System.out.println("Static method subtract");
	}

	// constructor

	// non static block
	{
		System.out.println("Non static block");
	}




	public static void main(String[] args) {
		int a;
		String ref="Pavan";

	}

	public static void addd(int ref1,int ref2) 
	{
		subtract();
		int a=ref1;
		int b=ref2;
		int c= a+b;
		System.out.println(c);
	}

}
