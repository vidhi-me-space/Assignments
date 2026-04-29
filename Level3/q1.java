import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the year as user input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is valid for the Gregorian calendar
        if (year >= 1582) {
            // Check if divisible by 4
            if (year % 4 == 0) {
                // Check if divisible by 100
                if (year % 100 == 0) {
                    // Check if divisible by 400
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    } else {
                        System.out.println(year + " is not a Leap Year");
                    }
                } else {
                    // Divisible by 4 but NOT by 100
                    System.out.println(year + " is a Leap Year");
                }
            } else {
                // Not divisible by 4
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            System.out.println("Please enter a year from 1582 onwards (Gregorian calendar).");
        }

        input.close();
    }
}
