package com.jm.ileetcode.algorithms.p002_add_two_numbers;

import java.util.Scanner;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void initData() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (!scanner.hasNextInt()) {
                break;
            }
            ListNode temp = new ListNode(scanner.nextInt());
            temp.next = this.next;
            this.next = temp;
        }
    }

    public void display() {
        ListNode temp = this;
        while (true) {
            if (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            } else {
                break;
            }
        }
    }
}
