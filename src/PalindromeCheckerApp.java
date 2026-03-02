/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 5: Stack-Based Palindrome Checker
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "madam";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC5");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}