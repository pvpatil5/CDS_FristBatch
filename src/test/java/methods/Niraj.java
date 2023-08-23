package methods;

public class Niraj 
{
	private static int a =10;
	private static int b= 30;
	
	public int c=50;
	
	public int readC() {
		return c;
	}
	

	public static int readA() {
		return a;
	}
	
	public static  int  readB() {
		return b;
	}
	
	public static String redB() {
		return "Mumbai";
	}
	
	
	
	
	
	
	
	public static void m1() {
		//System.out.println(a+b);
		System.out.println("static method");
		m2();
	}
	
	public static void m2() {
		System.out.println("non static method");
		m3();
	}
	
	final static void m3() {
		
		System.out.println("final method");
		m4();
	}
	
	private static void m4() {
		System.out.println("private method");
	}
	
	
	
	
	public String login() {
		// enter username
		// enter pwd
		// click login btn
		//home land
		 return "logged in successfully";
	}
	
	
}
