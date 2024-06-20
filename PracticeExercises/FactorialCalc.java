

import java.util.Scanner;


public class FactorialCalc	{

	public static void main(String[] args)	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int N = scanner.nextInt();

		if (N < 0)	{
			throw new IllegalArgumentException("Factorial not difined");
		}

		long factorial = 1;
		for (int i = 2; i <= N; i++)	{
			factorial *= i;
		}
		System.out.println(factorial);





	}
}













