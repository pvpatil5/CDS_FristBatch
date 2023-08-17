package object;

public class TestHouse {

	//	public class House
	//	{
	//
	//		static String architect= "Ram";
	//		int door=4;
	//		int window=8;
	//		
	//	}


	public static void main(String[] args) {

				 
		 
		House h1 = new House();
		House h2 = new House();
		House h3 = new House();
		House h4 = h3;


		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);


		System.out.println(h1.door); //4

		System.out.println(h2.door); //4

		h1.door=6;

		System.out.println(h1.door); //6

		System.out.println(h2.door); //4

		System.out.println(h3.window); //8

		System.out.println(h4.window);//8

		h3.window=10;

		System.out.println(h3.window); //10

		System.out.println(h4.window);//10


		System.out.println("===========");
		System.out.println(new House());
		System.out.println(new House().door);
		
		House h5 = new House();
		System.out.println(h5);
		h5= null; // we made this ref object as de-refenced
		System.out.println(h5);
		
		
	}

}
