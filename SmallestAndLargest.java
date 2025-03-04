import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];  // Array to store the smallest and largest numbers

        // Find the smallest number
        result[0] = Math.min(number1, Math.min(number2, number3));  // Smallest number

        // Find the largest number
        result[1] = Math.max(number1, Math.max(number2, number3));  // Largest number

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the findSmallestAndLargest method to get the result
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        scanner.close();
    }
}
