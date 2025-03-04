import java.util.Scanner;

public class ChocolateDivision {

    // Method to find how many chocolates each child gets and how many remain
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];  // Array to store chocolates per child and remaining chocolates

        // Calculate the number of chocolates each child gets (quotient)
        result[0] = numberOfChocolates / numberOfChildren;

        // Calculate the remaining chocolates (remainder)
        result[1] = numberOfChocolates % numberOfChildren;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the number of children is zero to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Error: Number of children cannot be zero.");
        } else {
            // Call the findRemainderAndQuotient method to get the result
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the result: number of chocolates per child and remaining chocolates
            System.out.println("Each child will get: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
        scanner.close();
    }
}
