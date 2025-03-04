public class SpringSeason {

    // Method to check if the given date is in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check if the month and day are within the Spring season (March 20 to June 20)
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            return true;  // It's within Spring season
        }
        return false;  // It's not within Spring season
    }

    public static void main(String[] args) {
        // Check if the correct number of arguments is provided (month and day)
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        // Parse the month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call the isSpringSeason method and check the result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
