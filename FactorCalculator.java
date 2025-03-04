import java.util.ArrayList;

public class FactorCalculator {

    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();

        // Loop to find all factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }

        // Convert ArrayList to array
        int[] factorsArray = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factorsArray[i] = factorsList.get(i);
        }
        return factorsArray;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Finding the factors
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculating sum, sum of squares, and product of the factors
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        double sumOfSquares = sumOfSquaresOfFactors(factors);

        // Displaying the results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        scanner.close();
    }
}
