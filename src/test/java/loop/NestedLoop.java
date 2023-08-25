package loop;

public class NestedLoop {

	public static void main(String[] args)
	{

		String str1="good"; // doog
		String reverse="";
		char ch[]=str1.toCharArray();
		// {'g','o','o',d}
		for(int i=ch.length-1;i>=0;i--) {
			reverse=reverse+ch[i];

		}
		System.out.println(reverse);


		System.out.println("===========================");
		int arr[]= {8,9,11,6};

		for (int i = arr.length-1; i>=0;i--) 
		{
			System.out.println(arr[i]);
		}

		System.out.println("===============================");

		String sentence ="India is on moon";
		//india is  on moon
		// 0     1  2   3

		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++)
		{
			String temp =words[i];	
			String temp2="";
			char c[]=temp.toCharArray();
			for (int k=c.length-1;k>=0;k--)
			{
				temp2=temp2+c[k];
			}
			System.out.println(temp2);
			
		}
		
		System.out.println("============================");
		
		


	}

}
