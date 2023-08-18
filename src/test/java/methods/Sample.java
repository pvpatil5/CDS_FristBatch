package methods;

public class Sample 
{
	public static String name = "Pavan"; // Scope throughout the project
	private static int a =150; // Scope with in class
	static long accNo=2222222; // Default -->Scope with in package


	public int m1()
	{
		int b=a+50;

		return b;


	}

	public String m2() 
	{
		String fullname=	name+" Patil";

		return fullname;
	}

	public void m3() 
	{
		Sample s1= new Sample();
		System.out.println(	s1.m1());
		System.out.println(s1.m2());
	}


	public void m4()
	{
		// Non static method 
		// it is void method--> not returning any thing
		
		System.out.println("Executing m4");
	}



}
