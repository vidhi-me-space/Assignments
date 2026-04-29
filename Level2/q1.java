import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfEmployees = 10;
        
        // Arrays to store employee data
        double[] oldSalaries = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];
        double[] bonuses = new double[numberOfEmployees];
        double[] newSalaries = new double[numberOfEmployees];

        // Variables for company totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("--- Enter Employee Data ---");
        
        // Loop 1: Take user input with validation
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            
            System.out.print("Enter salary: ");
            double salary = input.nextDouble();
            
            System.out.print("Enter years of service: ");
            double years = input.nextDouble();

            // Input Validation: Check for negative or invalid numbers
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input! Salary and years of service cannot be negative. Please try again.");
                i--; // Decrement the index counter to repeat this iteration
            } else {
                // If valid, save the data to our arrays
                oldSalaries[i] = salary;
                yearsOfService[i] = years;
            }
        }

        // Loop 2: Calculate bonuses, new salaries, and totals
        for (int i = 0; i < numberOfEmployees; i++) {
            // Determine bonus percentage
            if (yearsOfService[i] > 5) {
                bonuses[i] = oldSalaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = oldSalaries[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalaries[i] = oldSalaries[i] + bonuses[i];

            // Add to company totals
            totalOldSalary += oldSalaries[i];
            totalBonus
