package com.jm.ileetcode.algorithms.p003_longest_substring_without_repeating_characters;

import java.util.HashSet;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        HashSet<Character> characterSet = new HashSet<>();

        int answer = 0, a = 0, b = 0;

        while (a < s.length() && b < s.length()) {
            if (!characterSet.contains(s.charAt(b))) {
                characterSet.add(s.charAt(b));
                b++;

                // Update answer
                answer = b - a > answer ? b - a : answer;
            } else {
                characterSet.remove(s.charAt(a));
                a++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,
 * "pwke" is a subsequence and not a substring.
 */
