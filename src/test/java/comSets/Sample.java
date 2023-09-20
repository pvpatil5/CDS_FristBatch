package comSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		int arr[]= {5,3,2,5,4,9};
		
		
		Set<Integer> s1 = new HashSet<Integer>() ;
		
		for (int i = 0; i < arr.length; i++) 
		{
			s1.add(arr[i]);
		}

		System.out.println(s1);
	}

}
