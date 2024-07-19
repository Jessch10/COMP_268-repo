public class TempTable {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius)    {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static void main(String[] args) {
        // Table Header
        System.out.println("Temperature Conversion Tables\n");
        System.out.println("    Temperature     |     Temperature");
        System.out.println("      (degrees)     |       (degrees)");
        System.out.println("     F         C    |      C         F");
        
        
        // Table Body
        for (int i = 0; i < 100; i++) {
            double fahrenheit = -40 + i * 5;  // Start at -40, increment by 5
            double celsius = -40 + i * 5;

            // Formatted output with spaces per temperature and 3 decimal places
            System.out.printf("%7.3f %10.3f  | %10.3f %9.3f\n",
        fahrenheit, fahrenheitToCelsius(fahrenheit),
        celsius, celsiusToFahrenheit(celsius));

        }
    }
}
