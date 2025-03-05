import java.util.Arrays;

public class NumberChecker {

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

    // Method to check if the number is a Duck number (it has a non-zero digit at any position)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // The number is a Duck number if it contains any non-zero digit
            }
        }
        return false; // It doesn't contain any non-zero digit
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power); // Sum of each digit raised to the power of the number of digits
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;  // Test number (You can change this value to test with other numbers)

        // Step 1: Store the digits of the number
        int[] digits = storeDigits(number);

        // Step 2: Find count of digits
        int count = countDigits(number);
        System.out.println("Count of digits in the number: " + count);

        // Step 3: Check if it's a Duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is the number a Duck number? " + (isDuck ? "Yes" : "No"));

        // Step 4: Check if it's an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number, digits);
        System.out.println("Is the number an Armstrong number? " + (isArmstrong ? "Yes" : "No"));

        // Step 5: Find the largest and second largest elements
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        // Step 6: Find the smallest and second smallest elements
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
