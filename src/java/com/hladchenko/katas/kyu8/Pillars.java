package com.hladchenko.katas.kyu8;

/**
 * There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same. Your function accepts three arguments:
 * <p>
 * number of pillars (≥ 1);
 * distance between pillars (10 - 30 meters);
 * width of the pillar (10 - 50 centimeters).
 * Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).
 *
 * @see <a href="https://www.codewars.com/kata/5bb0c58f484fcd170700063d/train/java">Pillars</a>
 */
public class Pillars {
    public static int pillars(int numPill, int dist, int width) {
        if (numPill == 1) return 0;
        return (numPill - 1) * dist * 100 + (numPill - 2) * width;
    }
}
