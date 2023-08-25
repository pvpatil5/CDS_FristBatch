package loop;

public class Print {

	public static void main(String[] args) {
		String sentence ="India is on moon";
		//india is  on moon
		// 0     1  2   3

		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++)
		{
			System.out.print(words[i]+" ");
		}

	}

}
