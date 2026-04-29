import java.util.Scanner;

public class q3 {

    // Method to return characters without using toCharArray()
    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    // Method to compare two char arrays
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Get characters
        char[] userMethod = getChars(text);
        char[] builtIn = text.toCharArray();

        // Compare
        boolean isSame = compareArrays(userMethod, builtIn);

        // Output
        System.out.print("Characters (user-defined): ");
        for (char c : userMethod) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Characters (toCharArray): ");
        for (char c : builtIn) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("Are both arrays same? " + isSame);

        sc.close();
    }
}
