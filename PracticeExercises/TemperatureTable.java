public class TemperatureTable {

    // Static methods for conversions
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        int startTemp = -40;  // Starting temperature
        int entries = 100;    // Number of entries in the table
        int increment = 5;    // Temperature increment

        System.out.printf("%10s | %10s%n", "Fahrenheit", "Celsius");  // Table header
        System.out.println("---------------------------------");   // Separator line

        for (int i = 0; i < entries; i++) {
            double fahrenheit = startTemp + i * increment;
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%10.3f | %10.3f%n", fahrenheit, celsius); 
        }
    }
}