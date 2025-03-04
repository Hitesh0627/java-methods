import java.util.Scanner;

public class YoungestAndTallestFriends {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int youngestAge = Integer.MAX_VALUE;
        String youngest = "";

        // Loop through ages to find the youngest
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngest = names[i];
            }
        }

        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double tallestHeight = Double.MIN_VALUE;
        String tallest = "";

        // Loop through heights to find the tallest
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallest = names[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Names of the three friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height of " + names[i] + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Find and display the youngest and tallest
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);

        scanner.close();
    }
}
