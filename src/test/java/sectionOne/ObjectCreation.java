package sectionOne;

public class ObjectCreation {


	String name = "Audi";
	static int tyres= 4;
	double cc= 4000;
	static int a= 10;
	static int b= 20;
	


	public static void main(String[] args) 
	{
		String name = "Mercedes";
		double cc= 5000;		

		//System.out.println(name+"--"+tyres+"==="+cc);

		// how will u call non static memebrs of a class
		//	1. Create object
		//	2. call wit ref variable
		//Syantax=
		// ClassName ref= new ClassName();
		
		
		ObjectCreation ref = new ObjectCreation();
		
		name= "nissan";
		cc=3000;
		
	
		ref.name="Toyota";
		ref.cc=8000;
		System.out.println(ref.name+"--"+tyres+"==="+ref.cc);
		
		System.out.println(name+"--"+tyres+"==="+cc);
	}

}
