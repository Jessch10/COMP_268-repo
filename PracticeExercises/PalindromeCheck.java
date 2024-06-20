import java.util.Scanner;


public class PalindromeCheck	{
	
	public static void main(String[] args)	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word:");
		String userWord = scanner.nextLine();
        
        String cleanString = userWord.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedString = new StringBuilder(cleanString).reverse().toString();

        boolean isPalindrom = cleanString.equals(reversedString);

        if (isPalindrom)	{
        	System.out.println("The string" + userWord + "is a Palindrom.");
        } else {
        	System.out.println("The string" + userWord + "is not a Palindrom.");
        }
	}
}