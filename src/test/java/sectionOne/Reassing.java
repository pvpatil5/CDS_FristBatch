package sectionOne;

public class Reassing {

	static String name="Mercedes";
	static int tyres=6;


	public static void main(String[] args) {
		String name = "Audi";
		int tyres = 4;

		// Reassign values
		Reassing.name= name;
		Reassing.tyres=tyres;

		System.out.println(Reassing.name);
		System.out.println(Reassing.tyres);

		// Reassign values
		Reassing.name= "Nissan";
		Reassing.tyres=8;

		System.out.println(Reassing.name);
		System.out.println(Reassing.tyres);

		name=Reassing.name;
		tyres=Reassing.tyres;
		
		System.out.println("==="+name);
		System.out.println("=="+tyres);

	}

}
