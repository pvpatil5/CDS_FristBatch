package methods;

public class MultiMethods 
{
	int m1 =450;
	
	
	public void m1() 
	{
	System.out.println("m1 executing");	
	}
	
	public static void m2() {
		System.out.println(1000);
		System.out.println("m2 executing");
	}
	
	public int m3() {
		
		
		return 500;
		
	}
	
	public static String m4() {
		return "m4 executing";
	}
	
	
	public static void main(String[] args) {
		
		MultiMethods m1 = new MultiMethods();
//		m1.m1();
//		System.out.println(m1.m1);
//		MultiMethods.m2();
		
		int a1=m1.m3();
		System.out.println(a1);
		
		String s1=MultiMethods.m4();
		
		System.out.println(s1);
		
	}
	
}
