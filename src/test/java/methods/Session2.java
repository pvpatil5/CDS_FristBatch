package methods;

public class Session2 
{

	public static String name = "Pavan"; // Scope throughout the project
	private static int a =150; // Scope with in class
	static long accNo=2222222; // Default -->Scope with in package
	 double sal=500.5; 

	// Assess   access modified returntype method name

	//	public  static or non ststic  void or non void m1()  // method declaration
	//	{
	//		// method defination
	//	}


	// method with zero argument and void
	// i can declare method as public ,private, final, default, protected


	public void nonSaticMethod() 
	{
		System.out.println("Executing Non Static method");
	}

	public static void staticMethod() {
		System.out.println("Executing Static method");
	}

}
