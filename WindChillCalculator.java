import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Applying the wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Validate the inputs to ensure they are in acceptable ranges for wind chill calculation
        if (windSpeed < 3 || temperature > 50) {
            System.out.println("Wind chill calculation is not valid for the given inputs.");
        } else {
            // Create an instance of WindChillCalculator
            WindChillCalculator calculator = new WindChillCalculator();

            // Calculate the wind chill
            double windChill = calculator.calculateWindChill(temperature, windSpeed);

            // Display the calculated wind chill temperature
            System.out.println("The wind chill temperature is: " + windChill + " °F");
        }

        scanner.close();
    }
}
