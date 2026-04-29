import java.util.Scanner;

public class q2 {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // reached end
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String str) {
        int len = findLength(str);

        // Count words (assuming words separated by single spaces)
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaces = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaces[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            int end;

            if (i == wordCount - 1) {
                end = len;
            } else {
                end = spaces[i];
            }

            String temp = "";
            for (int j = start; j < end; j++) {
                temp += str.charAt(j);
            }

            words[i] = temp;
            start = end + 1;
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split
        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        // Compare
        boolean isSame = compareArrays(userWords, builtInWords);

        // Output
        System.out.println("Words (user-defined):");
        for (String w : userWords) {
            System.out.print(w + " | ");
        }

        System.out.println();

        System.out.println("Words (split()):");
        for (String w : builtInWords) {
            System.out.print(w + " | ");
        }

        System.out.println();

        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
