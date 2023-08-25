package loop;

public class Star1 {

	public static void main(String[] args) {
		String str="*";
		int lines=4;

		for (int i = 0; i < lines; i++)
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(str);	
			}
			System.out.println();
		}

	}

}
