package com.jm.ileetcode.algorithms.p011_container_with_most_water;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/14/2018
 * Time: 8:30 PM
 */

public class Solution {
    public static int maxArea(int[] height) {
        int maxArea = 0, lowIndex = 0, highIndex = height.length - 1;

        while (lowIndex < highIndex) {
            maxArea = Math.max(maxArea, Math.min(height[lowIndex], height[highIndex]) * (highIndex - lowIndex));
            if (height[lowIndex] < height[highIndex]) lowIndex++;
            else highIndex--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 1}));
    }
}

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines
 * are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis
 * forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 */
