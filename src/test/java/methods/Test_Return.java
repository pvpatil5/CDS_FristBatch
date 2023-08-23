package methods;

public class Test_Return {

	public static void main(String[] args) {
		Return_1 r1= new Return_1();
		
	
		System.out.println(r1); // Return_1@123ad
		
		
		//System.out.println(r1.test());
		
		int a = r1.test();	
		
		System.out.println(a);
		
		//System.out.println(r1.test2());
		
		boolean value = r1.test2();
		
		System.out.println(value);
		
		String str = r1.test3();
		
		System.out.println(str);
		
		int[] rr = r1.test4();
		
		System.out.println(rr);

	}

}
