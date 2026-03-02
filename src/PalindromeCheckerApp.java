/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 4: Character Array Based Palindrome Check
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "radar";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC4");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Convert String to Character Array
        char[] charArray = original.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}