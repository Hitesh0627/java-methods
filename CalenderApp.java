import java.util.Scanner;

public class CalenderApp {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // Array index starts from 0, so we subtract 1
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // February has 29 days in a leap year
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month (using the Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0; // Returns a value between 0 (Sunday) and 6 (Saturday)
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get month name and the number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar heading
        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Each day takes 4 spaces
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday (i.e., after 7th day)
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // Print a newline after the last day of the month
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take month and year as input from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        // Close the scanner
        scanner.close();
    }
}
