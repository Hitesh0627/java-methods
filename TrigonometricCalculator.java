import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate trigonometric functions (sine, cosine, and tangent)
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using the Math class
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an instance of TrigonometricCalculator
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Call the calculateTrigonometricFunctions method to get the results
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the trigonometric values
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        scanner.close();
    }
}
