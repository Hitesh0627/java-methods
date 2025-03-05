import java.util.Random;

public class FootballTeamHeight {

    // Method to generate the heights of the players
    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate random height between 150 and 250 cm
            heights[i] = rand.nextInt(101) + 150;  // Random value between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of all heights
    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMeanHeight(int[] heights) {
        int sum = sumHeights(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create an array of 11 players
        int[] heights = generateHeights(11);

        // Calculate sum of heights
        int sum = sumHeights(heights);
        
        // Calculate mean height
        double mean = calculateMeanHeight(heights);

        // Find shortest height
        int shortest = findShortestHeight(heights);

        // Find tallest height
        int tallest = findTallestHeight(heights);

        System.out.println("Heights of the players (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nResults:");
        System.out.println("Sum of all heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
