package comSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample2 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(56);
		a1.add(6);
		a1.add(5);
		a1.add(56);
		a1.add(57);
		
		Set <Integer> s1 = new HashSet<Integer>();
		
		s1.add(101);
		s1.add(109);
		s1.add(115);
		s1.add(111);
		
		//a1.addAll(s1);
		
		
		System.out.println(s1);
		
	}

}
