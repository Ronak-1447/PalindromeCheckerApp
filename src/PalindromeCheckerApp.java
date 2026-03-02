/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 */

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "racecar";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC7");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        // Compare front and rear elements
        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
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