package com.jm.ileetcode.algorithms.p007_reverse_integer;

public class Solution {
    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        if (x > 0) {
            stringBuilder.append(x);
            stringBuilder.reverse();
            try {
                return Integer.valueOf(stringBuilder.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        } else {
            x = Math.abs(x);
            stringBuilder.append(x);
            stringBuilder.reverse();
            try {
                return -Integer.valueOf(stringBuilder.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 * [−2^31,  (2^31) − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */
