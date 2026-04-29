import java.util.Random;
import java.util.Arrays;

public class FootballTeamHeights {

    // 1. Method to find the sum of all the elements
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // 2. Method to find the mean height
    public static double calculateMean(int[] heights) {
        // We can reuse our sum method here!
        int sum = calculateSum(heights);
        
        // Cast to double so we don't lose the decimal places during division
        return (double) sum / heights.length;
    }

    // 3. Method to find the shortest height
    public static int findShortest(int[] heights) {
        // Assume the first player is the shortest initially
        int shortest = heights[0];
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i]; // Update if we find someone shorter
            }
        }
        return shortest;
    }

    // 4. Method to find the tallest height
    public static int findTallest(int[] heights) {
        // Assume the first player is the tallest initially
        int tallest = heights[0];
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i]; // Update if we find someone taller
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create an int array named heights of size 11
        int[] heights = new int[11];
        Random random = new Random();

        // Populate the array with random heights between 150 and 250 cms
        for (int i = 0; i < heights.length; i++) {
            // random.nextInt(101) gives 0-100. Adding 150 makes it 150-250.
            heights[i] = random.nextInt(101) + 150;
        }

        // Display the raw array so we can see the generated heights
        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));
        System.out.println("-------------------------------------------------");

        // Call the methods and display the results
        System.out.println("Total sum of heights: " + calculateSum(heights) + " cm");
        System.out.println("Mean height:          " + calculateMean(heights) + " cm");
        System.out.println("Shortest player:      " + findShortest(heights) + " cm");
        System.out.println("Tallest player:       " + findTallest(heights) + " cm");
    }
}
