import java.util.Scanner;

public class q1 {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // keep accessing characters
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index goes out of range
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Lengths
        int userLength = findLength(text);
        int builtInLength = text.length();

        // Output
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in method: " + builtInLength);
        System.out.println("Are both lengths same? " + (userLength == builtInLength));

        sc.close();
    }
}
