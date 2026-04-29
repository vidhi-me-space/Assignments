import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if divisible by 5
        boolean isDivisible = (number % 5 == 0);

        // Print the output
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}
