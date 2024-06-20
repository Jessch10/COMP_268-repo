


import java.util.Scanner;


public class VowelCounter	{
	
	public static void main(String[] args)	{

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word or sentence:");
		String userWord = scanner.nextLine();
		

		int vowelCount = 0;

		for (int i = 0; i < userWord.length(); i++)	{
			char currentChar = userWord.charAt(i);

			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' ||
				currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' ||
				currentChar == 'O' || currentChar == 'U')	{

				vowelCount++;

			}
		}
	    System.out.println("The string \"" + userWord + "\" contains " + vowelCount + " vowels." );


	}
}