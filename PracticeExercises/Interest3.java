import java.util.Scanner;

public class Interest3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double principal;		// The value of the investment
		double rate;			// The annual interest rate

		/* Get the initial investment and interest rate from use */

		System.out.print("Enter the initial investment: ");
		principal = scanner.nextDouble();

		System.out.println("Enter the annual interest rate as a decimal ");
		rate = scanner.nextDouble();

		// consume leftover newline after reading the double
		scanner.nextLine();


		/* Simulate investment over 5 years */

		int years;  // Counts the number of years that have passed

		years = 0;
		while (years < 5) {
			double interest;		// Interest for the year
			interest = principal * rate;
			principal = principal + interest;		// or principle += interest Add it to principal
			years = years + 1;		// Count the current year
			System.out.print("The value of the investment after ");
			System.out.print(years);
			System.out.print("  years is $");
			System.out.printf("%1.2f" , principal);

		} // End of while loop
					
	}	// End of main
}	// End of class Interest3