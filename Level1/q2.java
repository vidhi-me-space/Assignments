import java.util.Scanner;

public class q2 {

    // Method to calculate combinations for handshakes
    public static int calculateHandshakes(int n) {
        // We use the provided combination formula
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate that there are at least 2 students to shake hands
        if (numberOfStudents >= 2) {
            // Call the method
            int handshakes = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of possible handshakes is: " + handshakes);
        } else {
            System.out.println("You need at least 2 students for a handshake!");
        }

        input.close();
    }
}
