import java.io.*;
import java.util.Scanner;

public class CityFileReader {

	public static void main(String[] args)	{
		String filename = "cities.txt";
		double totalSales = 0.0;
		int citiesWithoutData = 0;

		try (Scanner scanner = new Scanner(new File(filename))) {
			while (scanner.hasNextLine())	{
				String line = scanner.nextLine();
				String[] parts = line.split(":");

				if (parts.length == 2)	{
					try {
						double sales = Double.parseDouble(parts[1].trim());
						totalSales += sales;
					} catch (NumberFormatException e) {
						citiesWithoutData++;
						System.err.println("Missing data for city" + parts[0]);
					}
					
				} else {
					System.err.println("Incorrect line format: " + line);
				}
			}
		} catch (FileNotFoundException e)  {
			System.err.println("Error: File '" + filename + "' not found.");
			return;
		}
		System.out.println("Total sales: $" + totalSales);
		System.out.println("Cities with missing data: " + citiesWithoutData);

	}
}