import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder

        // Calculate the quotient and remainder
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the numerator (number) and divisor
        System.out.print("Enter the numerator (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Call the findRemainderAndQuotient method to get the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the quotient and remainder
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

        scanner.close();
    }
}

