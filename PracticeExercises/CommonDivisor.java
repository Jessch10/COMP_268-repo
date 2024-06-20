import java.util.Scanner;


public class CommonDivisor	{
	
	public static void main(String[] args)	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int numOne = scanner.nextInt();
		System.out.print("Enter the second number:");
		int numTwo = scanner.nextInt();

		while (numTwo != 0)	{
			int temp = numTwo;
			numTwo = numOne % numTwo;
			numOne = temp;
		}

		System.out.println("The GCD of the two numbers is:" + numOne);


	}
}