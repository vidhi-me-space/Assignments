import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store data
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Loop to take user input
        System.out.println("--- Enter Data for the Friends ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height (in cm): ");
            heights[i] = input.nextDouble();
        }

        // Variables to keep track of the index of the youngest and tallest
        // We start by assuming the first person (index 0) is the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            // Check if the current person's age is less than our recorded youngest
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            
            // Check if the current person's height is greater than our recorded tallest
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Print the results using the indexes we found
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[youngestIndex] + " at age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " at a height of " + heights[tallestIndex] + " cm.");

        input.close();
    }
}
