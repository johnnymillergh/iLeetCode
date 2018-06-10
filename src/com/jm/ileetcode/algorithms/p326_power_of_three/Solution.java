package com.jm.ileetcode.algorithms.p326_power_of_three;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/9/2018
 * Time: 11:01 PM
 */

public class Solution {

    static Set<Long> ints = new HashSet<>(100);
    static Set<Long> init(){
        ints = new HashSet<>(100);
        long x = 1 ;
        for (int i = 0; i < 41; i++ , x*=3) ints.add(x);
       return  ints;
    }


    public  boolean isPowerOfThree(int n) {
        return ints.contains((long)n);
    }

    public static void main(String[] args) {
//        System.out.println(isPowerOfThree(3));

    }
}
