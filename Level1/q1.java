import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define an array of 10 integer elements
        int[] ages = new int[10];

        // Take user input for the students' ages
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = input.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        
        // Loop through the array to check eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            
            if (age < 0) {
                System.out.println("Invalid age entered: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}
