/*
 * Application Name: Palindrome Checker App
 * Version: 1.0
 * Use Case 8: Linked List Based Palindrome Checker
 */

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String original = "level";

        System.out.println("========================================");
        System.out.println("Palindrome Checker App - UC8");
        System.out.println("========================================");

        System.out.println("Original String: " + original);

        // Convert string to singly linked list
        Node head = null;
        Node tail = null;

        for (int i = 0; i < original.length(); i++) {
            Node newNode = new Node(original.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Fast and Slow pointer to find middle
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half (in-place reversal)
        Node prev = null;
        Node current = slow;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Compare first half and reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;

        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        System.out.println("========================================");
        System.out.println("Program Ended.");
    }
}