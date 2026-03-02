/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 9: Recursive Palindrome Checker
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC9");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        boolean result = isPalindrome(original, 0, original.length() - 1);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(str, start + 1, end - 1);
    }
}