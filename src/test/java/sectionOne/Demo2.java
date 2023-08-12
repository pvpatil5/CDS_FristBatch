package sectionOne;

public class Demo2 {

	static {
		System.out.println("static block from Demo2");
	}
	
	public static void main(String[] args) {
		System.out.println(Demo.a+Demo.b);
		Demo.addition();
	}
}
