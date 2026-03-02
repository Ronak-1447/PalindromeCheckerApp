/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome Checker
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "A man a plan a canal Panama";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC10");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Step 1: Normalize string
        // Convert to lowercase and remove spaces using regular expression
        String normalized = original.toLowerCase().replaceAll("\\s+", "");

        System.out.println("Normalized String: " + normalized);

        // Step 2: Apply palindrome logic (Two-pointer approach)
        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}