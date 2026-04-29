import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define an integer array of 5 elements
        int[] numbers = new int[5];

        // Get user input to store in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\n--- Number Properties ---");
        
        // Loop through the array to check properties
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            
            if (num > 0) {
                // Check for even or odd if positive
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        System.out.println("\n--- Array Comparison ---");
        
        // Compare the first and last elements
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1]; // length is 5, so the last index is 4
        
        if (firstElement == lastElement) {
            System.out.println("The first element (" + firstElement + ") is equal to the last element (" + lastElement + ").");
        } else if (firstElement > lastElement) {
            System.out.println("The first element (" + firstElement + ") is greater than the last element (" + lastElement + ").");
        } else {
            System.out.println("The first element (" + firstElement + ") is less than the last element (" + lastElement + ").");
        }

        input.close();
    }
}
