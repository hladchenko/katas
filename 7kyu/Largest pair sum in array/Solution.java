/**
* Given a sequence of numbers, find the largest pair sum in the sequence.
*
* For example
* [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
* [99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
*/

import java.util.Arrays;

public class Solution {
    public static int largestPairSum(int[] numbers){
        int[] sorted = Arrays.stream(numbers).sorted().toArray();
        return sorted[numbers.length - 1] + sorted[numbers.length - 2];
    }
}
