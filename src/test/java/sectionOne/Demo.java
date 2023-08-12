package sectionOne;

public class Demo 
{
	//static is a keyword used to declare memebers of a class as static 

	// data members --> static
	// methods --> static
	// constructor --> X
	// static block --> static 
	// What is static block ?
	// if anyting[any code] you want to execute before main method then write that code inside static block


	// What happens or why we make data members methods static in java?
	// static memebers are also called as single copy memebers ?
	// a static memeber of a class can be loaded  inside JVM only once throughout the lifetime of the programme

	// for calling static members we use class name
	// classname.varibale name

	//Example

	// static variables
	static int a =30;
	//a=50;
	static int b = 20;
	
	static String name = "Pavan";
	static double weight = 70.20;
	int c=30;
	int d=40;

	//static method
	public static void  addition() 
	{
		System.out.println("Addition started");
		System.out.println(a+b);

	}

	// static block
	static {
		System.out.println("static block execution");
	}


	//non static
	public void add()
	{
		System.out.println(Demo.a+Demo.b);	
	}


	public static void main(String[] args) 
	{

		System.out.println("Main method executed");

		System.out.println(Demo.a+Demo.b);
		System.out.println(a+b);

		//System.out.println(c+d);


	}

}
