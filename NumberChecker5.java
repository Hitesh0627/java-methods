import java.util.Arrays;

public class NumberChecker5 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] tempFactors = new int[number];
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                tempFactors[count] = i;
                count++;
            }
        }
        // Create a new array with exact size
        int[] factors = new int[count];
        System.arraycopy(tempFactors, 0, factors, 0, count);
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1]; // Greatest factor is the last element
    }

    // Method to find the sum of the factors using the factors array and return the sum
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array and return the product
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube the factor using Math.pow
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number);
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number);
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number);
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate the factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number1 = 6;  // Example number for perfect, abundant, and deficient tests
        int number2 = 12; // Example number for abundant number
        int number3 = 18; // Example number for deficient number
        int number4 = 145; // Example number for strong number
        int number5 = 10;  // Example number for product of cubes of factors

        // Test find factors
        System.out.println("Factors of " + number1 + ": " + Arrays.toString(findFactors(number1)));

        // Test greatest factor
        System.out.println("Greatest factor of " + number1 + ": " + findGreatestFactor(number1));

        // Test sum of factors
        System.out.println("Sum of factors of " + number1 + ": " + sumOfFactors(number1));

        // Test product of factors
        System.out.println("Product of factors of " + number1 + ": " + productOfFactors(number1));

        // Test product of cubes of factors
        System.out.println("Product of cubes of factors of " + number5 + ": " + productOfCubesOfFactors(number5));

        // Test perfect number
        System.out.println(number1 + " is a perfect number: " + isPerfectNumber(number1));

        // Test abundant number
        System.out.println(number2 + " is an abundant number: " + isAbundantNumber(number2));

        // Test deficient number
        System.out.println(number3 + " is a deficient number: " + isDeficientNumber(number3));

        // Test strong number
        System.out.println(number4 + " is a strong number: " + isStrongNumber(number4));
    }
}
