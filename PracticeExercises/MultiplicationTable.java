import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args)	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int userNumber = scanner.nextLine();

		for (int i = 1; i <= userNumber; i++)	{
			for (int j = 1; j <= i; j++)	{
				System.out.print(i);
			}
		}
	}
}







