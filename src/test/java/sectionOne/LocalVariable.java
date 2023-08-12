package sectionOne;

public class LocalVariable 
{
	// Global --> The variables which are declared at class level are global variables
	// The scope of global variables will remain through out the class
	// Global variables can be static or non-static

	//Local Variable --> Variable declared inside a method or constructor or blocks(whether it is static or nonstatic)
	// The scope of local variables will be always inside the method.
	// Local variables we cannot declare static or nonstatic


	//--> Inside static method I cannot call non-static members directly. 
	//If I want to call i have to create a object first.

	//Global Variables example
	String city = "Pune";
	int pincode = 4100002;
	long population =78965412;
	static int avgAge =30;
	static String capitalPlace= "Deccan";


	//Global Variables
	public void Addition() {
		//String city ="Mumbai";
		System.out.println(capitalPlace);
		System.out.println("Non-Static method");
		int a = 100;
		int b= 200;
		System.out.println("Addition non static method got executed"+a+b);

		System.out.println(city);

	}

	public static void Subtract() {
		System.out.println("Static method");

		int avgAge =45;

		int a = 100;
		int b= 200;
		System.out.println("Subtract static method got executed"+(a-b));

		//System.out.println(pincode);
		System.out.println(avgAge);
	}


	public static void main(String[] args) {


		System.out.println(avgAge);  //global print

		int avgAge =50;
		System.out.println(avgAge); // local print

		System.out.println(capitalPlace);

		Subtract();

		// Object creation statement
		LocalVariable ref = new LocalVariable();
		ref.Addition();

		System.out.println(	ref.avgAge);
		
		System.out.println(ref.city);

		System.out.println(ref.pincode);



	}



}
