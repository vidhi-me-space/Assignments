import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take salary and years of service as inputs
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Initialize bonus amount to 0
        double bonusAmount = 0.0;

        // Check if years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            bonusAmount = salary * 0.05; 
            System.out.println("Eligible for a 5% bonus!");
        } else {
            System.out.println("Not eligible for a bonus. Requires more than 5 years of service.");
        }

        // Print the final bonus amount
        System.out.println("The bonus amount is: " + bonusAmount);

        input.close();
    }
}
