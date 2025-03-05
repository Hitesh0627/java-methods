import java.util.Random;

public class ZaraBonus {

    // Method to determine the salary and years of service of 10 employees
    public static double[][] generateEmployeeData() {
        double[][] employeeData = new double[10][2]; // [10][2] array to store salary and years of service
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            // Random salary between 10000 and 99999 (5-digit salary)
            double salary = 10000 + (random.nextDouble() * 90000);
            // Random years of service between 1 and 30
            double yearsOfService = 1 + (random.nextInt(30)); 

            employeeData[i][0] = salary;  // Store salary
            employeeData[i][1] = yearsOfService;  // Store years of service
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[10][3]; // New array with salary, bonus, and new salary

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02; // 5% bonus if years > 5, else 2%
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            updatedData[i][0] = salary;  // Old salary
            updatedData[i][1] = bonus;   // Bonus amount
            updatedData[i][2] = newSalary; // New salary
        }
        return updatedData;
    }

    // Method to calculate the total old salary, total new salary, and total bonus
    public static double[] calculateSums(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0]; // Old salary sum
            totalBonus += updatedData[i][1];     // Bonus sum
            totalNewSalary += updatedData[i][2]; // New salary sum
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    // Method to display employee data in tabular format
    public static void displayEmployeeData(double[][] updatedData, double[] sums) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s |\n", "Old Salary", "Bonus", "New Salary", "Years of Service");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("| %-10.2f | %-10.2f | %-10.2f | %-10.2f |\n", updatedData[i][0], updatedData[i][1], updatedData[i][2], (updatedData[i][2] - updatedData[i][0]) / updatedData[i][2] * 100);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", sums[0]);
        System.out.printf("Total New Salary: %.2f\n", sums[1]);
        System.out.printf("Total Bonus Paid: %.2f\n", sums[2]);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Generate random employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData();

        // Calculate the new salary and bonus for each employee
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Calculate total sums of old salary, new salary, and total bonus
        double[] sums = calculateSums(updatedData);

        // Display the results in a tabular format
        displayEmployeeData(updatedData, sums);
    }
}
