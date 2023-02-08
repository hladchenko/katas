package com.hladchenko.katas.kyu8;

/**
 * Your task is to find the nearest square number, nearest_sq(n) or nearestSq(n), of a positive integer n.
 *
 * For example, if n = 111, then nearest\_sq(n) (nearestSq(n)) equals 121, since 111 is closer to 121, the square of 11, than 100, the square of 10.
 *
 * If the n is already the perfect square (e.g. n = 144, n = 81, etc.), you need to just return n.
 *
 * Good luck :)
 *
 * @see <a href="https://www.codewars.com/kata/5a805d8cafa10f8b930005ba/train/java">Find Nearest square number</a>
 */
public class FindNearestSquareNumber {
  public static int nearestSq(final int n){
    int res = (int)Math.round(Math.sqrt(n));
    return res * res;
  }
}
