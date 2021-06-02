/*
 Small enough? - Beginner

 You will be given an array and a limit value.
 You must check that all values in the array are below or equal to the limit value.
 If they are, return true. Else, return false.
*/

package com.hladchenko.katas.kyu7;

public class SmallEnoughBeginner {
    public static boolean smallEnough(int[] a, int limit) {
        for (int el : a) {
            if (el > limit) {
                return false;
            }
        }
        return true;
    }
}
