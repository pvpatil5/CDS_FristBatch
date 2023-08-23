package userInput;

import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		
		// How to generate Random Number ?
		
		String name = "Robert";
		
		Random random = new   Random();
		int number=random.nextInt(1000);
		System.out.println(number); //1332600121
		String newName= name+number;
		System.out.println(newName);
		
		int a=10;
		
	}

}
