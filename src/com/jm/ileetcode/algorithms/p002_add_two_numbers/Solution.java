package com.jm.ileetcode.algorithms.p002_add_two_numbers;

/**
 * Definition for singly-linked list.<br>
 * public class ListNode {<br>
 * int val;<br>
 * ListNode next;<br>
 * ListNode(int x) { val = x; }<br>
 * }<br>
 * Problem Description:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)<br>
 * Output: 7 -> 0 -> 8<br>
 * Explanation: 342 + 465 = 807.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode pre = new ListNode(0);
        ListNode d = pre;
        int sum = 0;
        while (c1 != null || c2 != null) {
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }

            d.next = new ListNode(sum % 10);
            sum /= 10;
            d = d.next;
        }

        if (sum == 1) {
            d.next = new ListNode(1);
        }

        return pre.next;
    }

    public static void main(String[] args) {
        ListNode header1 = new ListNode(0);
        ListNode header2 = new ListNode(0);

        System.out.println("Non-number to stop input");
        System.out.print("First linked list:");
        header1.initData();

        System.out.print("Second linked list:");
        header2.initData();

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(header1, header2);

        result.display();
    }
}
