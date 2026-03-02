/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 2: Print Hardcoded Palindrome Result
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC2");
        System.out.println("========================================");

        System.out.println("Given Word: " + word);

        // Reverse the string
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Conditional check using if-else
        if (word.equals(reversedWord)) {
            System.out.println("Result: The given word is a Palindrome.");
        } else {
            System.out.println("Result: The given word is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}