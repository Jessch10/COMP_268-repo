import java.util.Scanner;

/**
* This program reads a sequence of positive integers inputs
* by the user, and it will print out the acerage of those
* integers. The user prompted to enter on integer at a
* time. The user  must enter a 0 to mark the end of the 
*date. (The zero is not counted as part of the date to
* be averaged.) The program does not check whether the
* user's input is positive, so it will actually add up
* both positive and negative input values.
*/

public class ComputeAverage {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);	

		int inputNumber;   // one of the integers input by the user
		int sum;			// The sum of the positive integers
		int count;			// The number of positive integers
		double average;		// The average of the positive integersa

		/* Initialize the summation and counting variables. */

		sum = 0;
		count = 0;

		/* Read and process the user's input. */

		System.out.print("Enter your first positive integer:  ");
		inputNumber = scanner.nextInt();

		while (inputNumber != 0)  {
			sum += inputNumber;		// Add inputNumber to running sum.
			count++;				// Count the input by adding 1 to count.
			System.out.print("Enter your next positive integer, or 0 to end:  ");
			inputNumber = scanner.nextInt();
		}

		/* Display the result */

		if (count == 0) {
			System.out.println("You didn't enter any data! ");
		}
		else {
			average = ((double)sum) / count;
			System.out.println();
			System.out.println("You entered" + count + "positive integers.");
			System.out.printf("Their average is %1.2f.\n", average);
		}

	} // end main()

}	// end class ComputeAverage