import java.util.Arrays;

public class NumberChecker4 {

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

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        int product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public static void main(String[] args) {
        int number1 = 121;
        int number2 = 36;
        int number3 = 55;
        int number4 = 7;
        int number5 = 407;

        // Check if the number is prime
        System.out.println(number1 + " is a prime: " + isPrime(number1));

        // Check if the number is a neon number
        System.out.println(number2 + " is a neon number: " + isNeonNumber(number2));

        // Check if the number is a spy number
        System.out.println(number3 + " is a spy number: " + isSpyNumber(number3));

        // Check if the number is an automorphic number
        System.out.println(number4 + " is an automorphic number: " + isAutomorphicNumber(number4));

        // Check if the number is a buzz number
        System.out.println(number5 + " is a buzz number: " + isBuzzNumber(number5));

        // Test with other numbers
        int number6 = 28;
        int number7 = 14;
        System.out.println(number6 + " is a prime: " + isPrime(number6));
        System.out.println(number6 + " is a neon number: " + isNeonNumber(number6));
        System.out.println(number7 + " is a spy number: " + isSpyNumber(number7));
        System.out.println(number7 + " is an automorphic number: " + isAutomorphicNumber(number7));
        System.out.println(number7 + " is a buzz number: " + isBuzzNumber(number7));
    }
}
