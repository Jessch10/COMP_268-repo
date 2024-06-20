

import java.util.Scanner;

public class WordSplitter {
	
	public static void main(String[] args)	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a line of text");
		String userWord = scanner.nextLine();

		for ( int i = 0; i < userWord.length(); i++)	{
			char character = userWord.charAt(i);

			if (Character.isLetter(character))	{
				System.out.print(character);
			}	else {
					if (i > 0 && Character.isLetter(userWord.charAt(i-1))) {
						System.out.println();
					}
			}
			
			
		}

		if (userWord.length() > 0 && Character.isLetter(userWord.charAt(userWord.length() - 1 ))) {
			System.out.println();
		}

	}
}