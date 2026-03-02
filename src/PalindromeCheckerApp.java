/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 3: Palindrome Check Using String Reverse
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC3");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Reverse the string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed string using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}