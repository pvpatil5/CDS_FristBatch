package methods;

public class Niraj 
{
	private static int a =10;
	private static int b= 30;
	

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
	}
	
	public void m2() {
		System.out.println("non static method");
	}
	
	final static void m3() {
		//m4();
		System.out.println("final method");
	}
	
	private static void m4() {
		System.out.println("private method");
	}
	
	
	
}
