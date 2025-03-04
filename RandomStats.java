import java.util.Random;

public class RandomStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];

        // Generating random 4-digit numbers (between 1000 and 9999)
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(9000) + 1000;  // Random number between 1000 and 9999
        }

        return randomNumbers;
    }

    // Method to find the average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculating the sum, min, and max values
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);  // Update min value
            max = Math.max(max, num);  // Update max value
        }

        // Calculating the average
        double average = sum / numbers.length;

        // Returning an array with average, min, and max values
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.print("Random 4-digit numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Find average, min, and max values
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
