

import java.util.Scanner;

/* This program will convert measurements expressed in inches,
* feet, yards, or miles into each of the possible units of
* measure. The Measurement is input by the user, followed by
* the unit of measure. For example:"17 feet", "1 inch", or "2.73 mi". Abbreviations in , fy, ya, and mi are
* accepted. The program will continue to read and convert measurements
* untile the user enters an input of 0.
*/
public class LengthConverter {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double measurement;
		String units;

		double inches, feet, yards, miles;



		System.out.println("Enter measurement in inches, feet, yards, or miles.");
		System.out.println("For example: 1 inch   17 feet   2.73 miles");
		System.out.println("You can use abbreviations:   in   ft   yd   mi");
		System.out.println("I will convert your input into the other units");
		System.out.println("of measure");
		System.out.println();

		while (true) {

			/* Get the user input, and convert it to lower case */

			System.out.print("Enter your measurement, or 0 to the end:     ");
			measurement = scanner.nextDouble();
			if (measurement == 0)
				break;		// Terminate the while loop.
			units = scanner.next();
			units = units.toLowerCase();

			/* Convert the input measurement to inches. */

			if (units.equals("inch") || units.equals("inches") || units.equals("in"))  {
				inches = measurement;
			}
			else if (units.equals("foot") || units.equals("feet") || units.equals("ft"))	{
				inches = measurement * 12;
			}	
			else if (units.equals("yard") || units.equals("yd")) {
				inches = measurement * 36;
			}
			else if (units.equals("mile") || units.equals("mi")) {
				inches = measurement * 12 * 5280;
			}
			else {
				System.out.println("Sorry, but I don't understand \"" + units + "\".");
				continue;
			}

			/* Convert measurement in inches to feet, yards, and miles. */

			feet = inches / 12;
			yards = inches / 36;
			miles = inches / (12*5280);

			/* Output measurement in terms of each unit of measure. */

				System.out.println();
				System.out.println("That's equivalent to: ");
				System.out.printf("%14.5g inches%n", inches);
				System.out.printf("%14.5g feet%n", feet);
				System.out.printf("%14.5g yards%n", yards);
				System.out.printf("%14.5g miles%n", miles);
				System.out.println();

			}	// End of while loop

			System.out.println();
			System.out.println("OK! Bye for now");



	}	// End of main()
}// End of Class.