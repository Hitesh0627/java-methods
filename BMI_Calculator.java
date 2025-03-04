import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] bmiData) {
        for (int i = 0; i < bmiData.length; i++) {
            double weight = bmiData[i][0];
            double heightInCm = bmiData[i][1];
            // Convert height from cm to meters
            double heightInM = heightInCm / 100;
            // Calculate BMI = weight / (height * height)
            double bmi = weight / (heightInM * heightInM);
            // Store the BMI in the third column of the array
            bmiData[i][2] = bmi;
        }
    }

    // Method to determine BMI status based on the calculated BMI
    public static String[] determineBMIStatus(double[][] bmiData) {
        String[] bmiStatus = new String[bmiData.length];
        
        for (int i = 0; i < bmiData.length; i++) {
            double bmi = bmiData[i][2];
            // Determine BMI status based on the calculated BMI
            if (bmi < 18.5) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                bmiStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        
        return bmiStatus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] bmiData = new double[10][3];
        
        // Taking input for weight (kg) and height (cm) for each person
        System.out.println("Enter the weight (in kg) and height (in cm) for each of the 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            bmiData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = scanner.nextDouble();
        }

        calculateBMI(bmiData);
        
        String[] bmiStatus = determineBMIStatus(bmiData);

        System.out.println("\nBMI and Status of each individual:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + bmiData[i][0] + " kg");
            System.out.println("Height: " + bmiData[i][1] + " cm");
            System.out.println("BMI: " + String.format("%.2f", bmiData[i][2]));
            System.out.println("Status: " + bmiStatus[i]);
            System.out.println();
        }

        scanner.close();
    }
}
