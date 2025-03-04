import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;  // Base case: sum of 1 is 1
        } else {
            return n + sumUsingRecursion(n - 1);  // Recursive case
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;  // Formula: n * (n + 1) / 2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        
        // Checking if the input is a valid natural number
        if (!scanner.hasNextInt()) {
            System.out.println("Input is not a valid number. Exiting.");
            return;
        }
        
        int n = scanner.nextInt();
        
        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number is not a natural number. Exiting.");
            return;
        }

        // Finding sum using recursion
        int sumRecursion = sumUsingRecursion(n);
        
        // Finding sum using the formula
        int sumFormula = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        
        // Comparing the results
        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the correct and same result!");
        } else {
            System.out.println("There is an error, the results don't match.");
        }

        scanner.close();
    }
}
