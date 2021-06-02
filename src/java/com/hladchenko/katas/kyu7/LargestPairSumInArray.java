/*
  Largest pair sum in array

 Given a sequence of numbers, find the largest pair sum in the sequence.

 For example
 [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
 [99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
*/

package com.hladchenko.katas.kyu7;

import java.util.Arrays;

public class LargestPairSumInArray {
    public static int largestPairSum(int[] numbers){
        int[] sorted = Arrays.stream(numbers).sorted().toArray();
        return sorted[numbers.length - 1] + sorted[numbers.length - 2];
    }
}
