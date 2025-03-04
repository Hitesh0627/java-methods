import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of a quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate discriminant (delta)
        double[] roots = new double[0]; // Default empty array if no real roots

        if (delta > 0) {
            // Two real roots
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);  // root1
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);  // root2
        } else if (delta == 0) {
            // One real root
            roots = new double[1];
            roots[0] = -b / (2 * a);  // root
        }
        // If delta < 0, return an empty array (no real roots)
        return roots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.println("The roots of the equation are: ");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
