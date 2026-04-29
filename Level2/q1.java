import java.util.Scanner;
import java.util.Arrays;

public class FactorAnalyzer {

    // 1. Method to find factors and return them as an array
    public static int[] findFactors(int number) {
        // First loop: Find the count of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the exact size needed
        int[] factors = new int[count];
        int index = 0;

        // Second loop: Save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }

    // 2. Method to find the sum of the factors
    public static long sumOfFactors(int[] factors) {
        long sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // 3. Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // 4. Method to find the sum of squares using Math.pow()
    public static double sumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to analyze its factors: ");
        int number = input.nextInt();

        // Call the method to get the array of factors
        int[] factors = findFactors(number);

        // Display the array (Arrays.toString makes it look nice like [1, 2, 4])
        System.out.println("The factors of " + number + " are: " + Arrays.toString(factors));

        // Call the other methods and display results
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquareOfFactors(factors));

        input.close();
    }
}
