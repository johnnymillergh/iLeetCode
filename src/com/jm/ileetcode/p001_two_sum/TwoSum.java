package com.jm.ileetcode.p001_two_sum;

import java.util.HashSet;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] resultIndices = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            int firstCandidate = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int secondCandidate = nums[j];
                if (firstCandidate + secondCandidate == target) {
                    resultIndices[0] = i;
                    resultIndices[1] = j;
                }
            }
        }

        return resultIndices;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 8);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
