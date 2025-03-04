import java.util.Scanner;

public class SumOfNaturalNumber {

    // Method to find the sum of first 'n' natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop through numbers from 1 to n and add them to the sum
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add i to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value of n
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Check if n is a positive integer
        if (n > 0) {
            // Call the sumOfNaturalNumbers method and store the result
            int result = sumOfNaturalNumbers(n);
            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        } else {
            // If n is not a positive integer
            System.out.println("Please enter a positive integer.");
        }


        scanner.close();
    }
}
