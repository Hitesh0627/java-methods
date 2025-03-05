import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Math.random() generates a number between 0.0 and 1.0, so multiplying by 1000000 and casting to int ensures a 6-digit number
        return (int) (Math.random() * 900000) + 100000; // Ensures OTP is always a 6-digit number
    }

    // Method to check if the generated OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // If a duplicate OTP is found, return false
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        // Array to store the OTP numbers generated 10 times
        int[] otps = new int[10];

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all OTPs are unique
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }
}
