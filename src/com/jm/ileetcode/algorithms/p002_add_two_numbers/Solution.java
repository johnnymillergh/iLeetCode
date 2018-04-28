package com.jm.ileetcode.algorithms.p002_add_two_numbers;

import java.util.Scanner;

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
        ListNode result = new ListNode(-1);
        ListNode tail = result;
        ListNode iterator1 = l1.next;
        ListNode iterator2 = l2.next;

        boolean isOverTen = false;
        while (iterator1 != null || iterator2 != null) {
            ListNode sum = null;

            int rawSum = iterator1.val + iterator2.val;
            if (isOverTen) rawSum += 1;

            if (rawSum < 10) {
                sum = new ListNode(rawSum);
                isOverTen = false;
            } else {
                sum = new ListNode((iterator1.val + iterator2.val) % 10);
                isOverTen = true;
            }

            sum.next = tail.next;
            tail.next = sum;
            tail = sum;

            iterator1 = iterator1.next;
            iterator2 = iterator2.next;
        }

        return result.next;
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
