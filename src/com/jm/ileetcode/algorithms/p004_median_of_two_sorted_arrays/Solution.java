package com.jm.ileetcode.algorithms.p004_median_of_two_sorted_arrays;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] num3 = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                num3[k++] = nums1[i++];
            } else {
                num3[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            num3[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            num3[k++] = nums2[j++];
        }

        if (num3.length % 2 == 1) {
            return num3[num3.length / 2];
        } else {
            return (num3[num3.length / 2] + num3[num3.length / 2 - 1]) / 2d;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * <p>
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
