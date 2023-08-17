package object;

public class TestDemo {
	
	public void add() {
		Demo d2 = new Demo();
		System.out.println("executiong method ="+(d2.a+d2.b));
	}
	
	
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		String newname=new Demo().name;
		int a=new Demo().a;
		
		System.out.println(newname);
		
		
		
		int t1= d1.a;
		int t2= d1.b;
		
		String t3 = d1.name;
		
		System.out.println(t1);
		
		System.out.println(t2);
		
		System.out.println(t3);
		
		System.out.println("=====================");
		
		System.out.println(d1.a+d1.b);
		
		System.out.println("=====================");

		d1.a=45;
		
		d1.b=100;
		System.out.println(d1.a+d1.b);
		
		TestDemo test = new TestDemo();
		test.add();
		
	
		
		
		
		
		
		
		
		
	}
	
	


}
