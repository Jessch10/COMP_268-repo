import java.util.Scanner;

/**
* This program prints out a 3N+1 sequence starting from a positive
* integer specified by the user. It aslo counts the number of
* terms in the sequence, and prints out that number.
*/
public class ThreeN1 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N;
		int counter;

		System.out.print("Starting point for the sequence: ");
		N = scanner.nextInt();

		while (N <= 0) {
			System.out.print("The starting point must be a positive number.");
			N = scanner.nextInt();
		}
		
		// at this point we know that N>0

		counter = 0;
		while (N != 1) {
			if (N%2 == 0)
				N = N/2;
			else
				N=3*N+1;
			System.out.println(N);
			counter = counter + 1;
		}

		System.out.println();
		System.out.print("There were");
		System.out.print(counter);
		System.out.println(" terms in the sequence.");

	}   // end of main ()

}	// end of class ThreeN1