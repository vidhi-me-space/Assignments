import java.util.Scanner;

public class q2 {

    // Method 1: Find sum using Recursion
    public static long sumRecursive(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive step: n + sum of (n-1)
        return n + sumRecursive(n - 1);
    }

    // Method 2: Find sum using the mathematical formula
    public static long sumFormula(int n) {
        // We cast to long to prevent overflow if n is large
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = input.nextInt();

        // Check if it's a natural number
        if (n > 0) {
            // Compute using both methods
            long resultRecursive = sumRecursive(n);
            long resultFormula = sumFormula(n);

            // Print the individual results
            System.out.println("Sum using Recursion: " + resultRecursive);
            System.out.println("Sum using Formula:   " + resultFormula);

            // Compare and verify
            System.out.println("-------------------------------------------------");
            if (resultRecursive == resultFormula) {
                System.out.println("Success! Both computations produced the correct and identical result: " + resultRecursive);
            } else {
                System.out.println("Error: The computations do not match.");
            }
        } else {
            System.out.println("Invalid input. A natural number must be greater than 0.");
        }

        input.close();
    }
}
