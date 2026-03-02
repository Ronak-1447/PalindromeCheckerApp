/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// Step 1: Define the Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Step 2: Implement Stack-based Strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {

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
}

// Step 3: Implement Deque-based Strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {

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
}

// Step 4: Context class to use strategy
class PalindromeContext {

    private PalindromeStrategy strategy;

    // Inject strategy dynamically
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.isPalindrome(str);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Racecar";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC12 (Strategy Pattern)");
        System.out.println("========================================");

        System.out.println("Input String: " + input);

        PalindromeContext context = new PalindromeContext();

        // Use Stack Strategy
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " +
                (context.check(input) ? "Palindrome" : "Not Palindrome"));

        // Use Deque Strategy
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " +
                (context.check(input) ? "Palindrome" : "Not Palindrome"));

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}