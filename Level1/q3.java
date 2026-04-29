import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number for its multiplication table: ");
        int number = input.nextInt();

        // Define an array to store 10 results
        int[] tableResults = new int[10];

        // Store the results in the multiplication table array
        for (int i = 1; i <= 10; i++) {
            // Arrays are 0-indexed, so we store result of x1 at index 0, x2 at index 1, etc.
            tableResults[i - 1] = number * i;
        }

        System.out.println("\n--- Multiplication Table for " + number + " ---");
        
        // Display the results from the array
        for (int i = 0; i < tableResults.length; i++) {
            // i is the index (0 to 9), so we add 1 to show the multiplier (1 to 10)
            int multiplier = i + 1; 
            System.out.println(number + " * " + multiplier + " = " + tableResults[i]);
        }

        input.close();
    }
}
