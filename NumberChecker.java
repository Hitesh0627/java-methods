import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive or negative
    public static String isPositive(int num) {
        if (num >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    // Method to check if the number is even or odd
    public static String isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  // num1 is greater
        } else if (num1 == num2) {
            return 0;  // both are equal
        } else {
            return -1;  // num1 is less
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check whether the number is positive or negative
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            String positivity = isPositive(num);
            if (positivity.equals("positive")) {
                String evenOdd = isEvenOrOdd(num);
                System.out.println("Number " + num + " is positive and " + evenOdd + ".");
            } else {
                System.out.println("Number " + num + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
