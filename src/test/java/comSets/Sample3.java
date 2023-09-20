package comSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample3 {

	public static void main(String[] args) {
		
		
		Set <Integer> s1 = new HashSet<Integer>();
		
		s1.add(101);
		s1.add(109);
		s1.add(111);
		s1.add(105);
		s1.add(118);
		
		Iterator<Integer> i1 = s1.iterator();
		
		while (i1.hasNext()) 
		{
			System.out.println(i1.next());			
		}
		
	}

}
