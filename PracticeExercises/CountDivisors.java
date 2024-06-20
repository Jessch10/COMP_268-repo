

import java.util.Scanner;

public class CountDivisors {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N;		// A positiv integer entered by the user. Divisors of this number will be counted

		int testDivisor; // A number between 1 and N that is a possible divisor of N

		int divisorCount;		// Number of divisors of N that have been found

		int numberTested;		// Used to cound how many possible divisors of N have been tested. When
								// 10000000 has been reached a period is output and value or numberTested
								// is reset to zero

		/* Get a postive integer from the user. */

		while (true) {
			System.out.print("Enter a positive integer: ");
			N = scanner.nextInt();
			if (N > 0)
				break;
			System.out.println("That number is not positive, try again.");
		}

		/* Count the divisors, printing an "." after every 10000000 tests. */

		divisorCount = 0;
		numberTested = 0;

		for (testDivisor = 1; testDivisor <= N; testDivisor++)	{
			if(N % testDivisor == 0)
				divisorCount++;
			numberTested++;
			if(numberTested == 10000000)
				System.out.print('.');
				numberTested = 0;
		}

		/* Display the result */

		System.out.println();
		System.out.println("The number of divisors of" + N + "is" + divisorCount);
	}
}