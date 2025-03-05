import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if the slopes are equal
        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    // Method to check collinearity using the area of the triangle formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Points are collinear if the area is zero
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check collinearity using both methods
        boolean areCollinearUsingSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areCollinearUsingArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        if (areCollinearUsingSlope && areCollinearUsingArea) {
            System.out.println("The points are collinear using both methods.");
        } else {
            System.out.println("The points are not collinear.");
        }

        scanner.close();
    }
}
