import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Take base and height inputs in cm
        System.out.print("Enter the base in cm: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height in cm: ");
        double height = input.nextDouble();

        // Calculate area in square centimeters (1/2 * base * height)
        double areaSqCm = 0.5 * base * height;
        
        // Convert the area to square inches
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Print the result matching the requested O/P format
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        
        // Close the scanner
        input.close();
    }
}
