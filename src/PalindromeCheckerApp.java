/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 13: Performance Comparison
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Stack-based palindrome checker
    public static boolean isPalindromeStack(String str) {
        String normalized = str.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque-based palindrome checker
    public static boolean isPalindromeDeque(String str) {
        String normalized = str.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new LinkedList<>();
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Two-pointer approach
    public static boolean isPalindromeTwoPointer(String str) {
        String normalized = str.toLowerCase().replaceAll("\\s+", "");
        int start = 0, end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC13 (Performance Comparison)");
        System.out.println("========================================");
        System.out.println("Input String: " + input);
        System.out.println("----------------------------------------");

        // Stack-based
        long startTime = System.nanoTime();
        boolean stackResult = isPalindromeStack(input);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;
        System.out.println("Stack Approach: " + (stackResult ? "Palindrome" : "Not Palindrome")
                + " | Time: " + stackTime + " ns");

        // Deque-based
        startTime = System.nanoTime();
        boolean dequeResult = isPalindromeDeque(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;
        System.out.println("Deque Approach: " + (dequeResult ? "Palindrome" : "Not Palindrome")
                + " | Time: " + dequeTime + " ns");

        // Two-pointer
        startTime = System.nanoTime();
        boolean twoPointerResult = isPalindromeTwoPointer(input);
        endTime = System.nanoTime();
        long twoPointerTime = endTime - startTime;
        System.out.println("Two-Pointer Approach: " + (twoPointerResult ? "Palindrome" : "Not Palindrome")
                + " | Time: " + twoPointerTime + " ns");

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}