import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; // Combination formula to calculate handshakes
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Ensure the number of students is at least 2, as at least two students are needed for a handshake
        if (n < 2) {
            System.out.println("At least 2 students are required to form handshakes.");
        } else {
            // Calculate the number of handshakes
            int handshakes = calculateHandshakes(n);

            
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }

        // Close the scanner
        scanner.close();
    }
}

