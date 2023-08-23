package methods;

public class Sample_1 
{

	public static void test() {
		System.out.println("static method");
	}
	
	public void test2() {
		System.out.println("Non static method");
	}
	
	public static int test3() {
		
		return 10;
	}
	
	public String test4() {
		return "Hello world";
	}
	
	
	public void add(double a,double b) {
		double c = a+b;
		System.out.println(c);
	}
	

	public double subtract(double a,double b) {
		double c = a-b;
		return c;
	}
	
}
