import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if it is a Natural Number (greater than 0)
        if (number > 0) {
            // Iterate from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Check if the current loop number 'i' is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            // Output if the user enters 0 or a negative number
            System.out.println("The number " + number + " is not a natural number.");
        }

        input.close();
    }
}
