/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 11: Object-Oriented Palindrome Service
 */

import java.util.Stack;

// PalindromeChecker class encapsulates palindrome logic
class PalindromeChecker {

    // Method to check palindrome using stack
    public boolean checkPalindrome(String str) {

        // Normalize string (optional: remove spaces & ignore case)
        String normalized = str.toLowerCase().replaceAll("\\s+", "");

        // Use stack to reverse characters
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        // Compare original vs reversed using stack
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Madam";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC11 (OOP)");
        System.out.println("========================================");

        System.out.println("Input String: " + input);

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Check palindrome using object
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}