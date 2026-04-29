import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Take the Celsius temperature as user input
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Use the formula to convert to Fahrenheit
        // We use 9.0 and 5.0 to ensure precise decimal division
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;

        // Print the result
        System.out.println(celsius + "°C is equal to " + fahrenheitResult + "°F");

        // Close the scanner
        input.close();
    }
}
