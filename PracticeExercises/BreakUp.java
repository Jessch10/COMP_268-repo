import java.util.Scanner;

public class BreakUp {
	
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String line = scanner.nextLine();

		String[] words = line.split("[^a-zA-Z]+");

		System.out.println(words);
		System.out.println(line);


		
	}
}