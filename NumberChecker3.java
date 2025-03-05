import java.util.Arrays;

public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // A duck number has a zero in it but doesn't start with zero
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0 && i != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number1 = 121;
        int number2 = 2001;
        int number3 = 303;

        // Test count of digits
        System.out.println("Count of digits in " + number1 + ": " + countDigits(number1));

        // Store digits of the number in an array
        int[] digitsOfNumber1 = storeDigits(number1);
        System.out.println("Digits of " + number1 + ": " + Arrays.toString(digitsOfNumber1));

        // Reverse digits of the number
        int[] reversedDigits = reverseDigits(digitsOfNumber1);
        System.out.println("Reversed digits of " + number1 + ": " + Arrays.toString(reversedDigits));

        // Check if the number is a palindrome
        System.out.println(number1 + " is a palindrome: " + isPalindrome(number1));

        // Check if the number is a duck number
        System.out.println(number2 + " is a duck number: " + isDuckNumber(number2));

        // Test another number
        System.out.println(number3 + " is a palindrome: " + isPalindrome(number3));
        System.out.println(number3 + " is a duck number: " + isDuckNumber(number3));
    }
}
