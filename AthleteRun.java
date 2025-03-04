import java.util.Scanner;

public class AthleteRun {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed to complete 5 km run
    public static double calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km in meters
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three sides of the triangle
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate the number of rounds the athlete needs to run 5 km
        double rounds = calculateRounds(perimeter);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");

        scanner.close();
    }
}
