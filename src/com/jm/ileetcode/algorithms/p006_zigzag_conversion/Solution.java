package com.jm.ileetcode.algorithms.p006_zigzag_conversion;

public class Solution {
    public static String convert(String s, int numRows) {
        if(s==null||s.length()==0) return "";
        if (numRows == 1 || s.length() < numRows) {
            return s;
        }

        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        boolean isOpposite = false;
        int count;
        int i;
        int length = s.length();

        for (i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        for (i = 0; i < numRows; i++) {
            stringBuilders[i].append(s.charAt(i));
        }
        count = numRows;

        while (true) {
            if (i < length) {
                if (count == numRows || count == 1) {
                    isOpposite = !isOpposite;
                }
                if (!isOpposite) {
                    count++;
                    stringBuilders[count - 1].append(s.charAt(i));
                    i++;
                } else {
                    count--;
                    stringBuilders[count - 1].append(s.charAt(i));
                    i++;
                }
            } else {
                break;
            }
        }

//        for (int j = 0; j < numRows; j++) {
//            System.out.println(stringBuilders[j].toString());
//        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : stringBuilders) {
            result.append(sb);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}
/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
