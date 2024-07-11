import java.util.Scanner;


public class TemperatureConversion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program converts Temperatures from Fahrenheit to Celsius and vice versa.");
        String anotherConversion = "Yes";
        String unitMeasurement = "";
        String convertedUnit = "";
        double unitConversion = 0;

        while (anotherConversion.equalsIgnoreCase("Yes")) {
            System.out.print("Please enter your temperature:");
            double userTemp = scanner.nextDouble();
            System.out.print("Please enter the units (F/C):");  
            String userUnit = scanner.next();
            

            if (userUnit.equalsIgnoreCase("C")) {
                unitConversion = ((userTemp * 9.0) / 5.0 + 32); 
                convertedUnit = "Fahrenhite";
                unitMeasurement = "Celcius";          
            } else if (userUnit.equalsIgnoreCase("F")) {
                unitConversion = ((userTemp - 32) * (5.0/9.0));
                convertedUnit = "Celcius";
                unitMeasurement = "Fahrenhite";
            } else {
                System.out.println("You inputed an incorrect unit of measurement, please try again.");
                continue;
            }
            
            System.out.println("A temperature of " + userTemp + " degrees " + unitMeasurement + " is equivalent to " + unitConversion + " degrees " + convertedUnit);
            System.out.println("Do you wish another conversion? (No/Yes)");
            anotherConversion = scanner.next();
            continue;
        }
        System.out.print("Thank you. Goodbye.");

    
    }
}
