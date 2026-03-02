/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 6: Queue + Stack Based Palindrome Check
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC6");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            queue.add(ch);     // Enqueue (FIFO)
            stack.push(ch);    // Push (LIFO)
        }

        // Compare Dequeue vs Pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
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