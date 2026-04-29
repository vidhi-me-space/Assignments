import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Take the input for a number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Convert to positive if the user enters a negative number
        number = Math.abs(number);

        // Edge case: if the number is exactly 0
        if (number == 0) {
            System.out.println("Digit 0 appears 1 time(s)");
            input.close();
            return;
        }

        // 2. Find the count of digits in the number
        long tempCounter = number;
        int digitCount = 0;
        
        while (tempCounter > 0) {
            digitCount++;
            tempCounter /= 10; // Remove the last digit
        }

        // 3. Find the digits in the number and save them in an array
        int[] digits = new int[digitCount];
        long tempExtractor = number;
        
        // We loop backward to put the digits in the correct order (left to right)
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int) (tempExtractor % 10); // Extract the last digit
            tempExtractor /= 10; // Remove the last digit
        }

        // 4. Find the frequency of each digit
        // We define a frequency array of size 10 (for digits 0 through 9)
        int[] frequency = new int[10];

        // Loop through the digits array and increase the count at the matching index
        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i];
            frequency[currentDigit]++; 
        }

        // 5. Display the frequency of each digit
        System.out.println("\n--- Digit Frequencies for " + number + " ---");
        
        // Loop through the 0-9 frequency array
        for (int i = 0; i < frequency.length; i++) {
            // Only print if the digit actually appeared (frequency > 0)
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
