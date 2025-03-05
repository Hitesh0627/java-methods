import java.util.Arrays;

public class NumberChecker2 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        String numberString = Integer.toString(number);
        int[] digits = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = numberString.charAt(i) - '0';  // Convert char to int
        }
        return digits;
    }

    // Method to find the sum of the digits in the number using the digits array
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits in the number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = sumDigits(digits);
        return (number % sumOfDigits == 0);
    }

    // Method to find the frequency of each digit in the number using a 2D array
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // 10 digits, and each digit will have a count
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // First column is the digit
            frequency[i][1] = 0; // Initialize frequency as 0
        }
        
        for (int digit : digits) {
            frequency[digit][1]++;  // Increment the frequency of the digit
        }
        
        return frequency;
    }

    public static void main(String[] args) {
        int number = 21;  // Test number (you can change this to test with other numbers)

        // Step 1: Store the digits of the number
        int[] digits = storeDigits(number);

        // Step 2: Find count of digits
        int count = countDigits(number);
        System.out.println("Count of digits in the number: " + count);

        // Step 3: Find the sum of the digits
        int sumOfDigits = sumDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Step 4: Find the sum of the squares of the digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of the squares of the digits: " + sumOfSquares);

        // Step 5: Check if it's a Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is the number a Harshad number? " + (isHarshad ? "Yes" : "No"));

        // Step 6: Find the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " time(s)");
            }
        }
    }
}
