package methods;

public class Demo
{

	// Arugment methods
	
	
	
	
	public void test() {
		System.out.println("with arg");
	}

	public void test(int a) {
		System.out.println("Value of a is ="+a);

	}
	
	
	
	public void test(String str) {
		System.out.println(str);
	}

	public void test2(String str) {
		System.out.println("Value of String is ="+str);
	}

	public void test3(int a, int b) {
		int c= a+b;
		System.out.println("After adding="+c);
	}

	public void test4(String s,int b) {
		System.out.println("Value of String is ="+s);
		System.out.println("Value of int is ="+b);
	}
	public void test5(boolean val) {
		System.out.println("Value is = "+val);
	}


}
