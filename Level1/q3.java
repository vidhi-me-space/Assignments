import java.util.Scanner;

public class q3 {

    // Method to compute the number of rounds
    public static double calculateRounds(double side1, double side2, double side3, double targetDistance) {
        // Calculate the perimeter (one full round)
        double perimeter = side1 + side2 + side3;
        
        // Calculate the rounds needed
        return targetDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the 3 sides of the triangle in meters
        System.out.print("Enter side 1 of the park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of the park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of the park (in meters): ");
        double side3 = input.nextDouble();

        // 5 km is equal to 5000 meters
        double targetDistance = 5000.0;

        // Call the method to find out how many rounds
        double rounds = calculateRounds(side1, side2, side3, targetDistance);

        // Display the result
        System.out.println("To complete a 5km run, the athlete must complete " + rounds + " rounds.");
        
        // Bonus Tip: If you want to know how many *full* rounds to guarantee they pass 5km,
        // you could use Math.ceil(rounds) to round up to the next whole number!

        input.close();
    }
}
