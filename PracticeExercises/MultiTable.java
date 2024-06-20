

import java.util.Scanner;


public class MultiTable	{
	
	public static void main(String[] args)	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int N = scanner.nextInt();
		int product;
		product = 0;



		for (int i = 1; i <= 10; i++)	{
			System.out.print(N);
			System.out.print('x');
			System.out.print(i);
			System.out.print('=');
			System.out.print(N * i);
			System.out.println();
			
		}

		
	}
}


















