/*
    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram.
    Ignore letter case.

    "Dermatoglyphics" --> true
    "aba" --> false
    "moOse" --> false (ignore letter casing)
 */
package com.hladchenko.katas.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
    }

    public static boolean  isIsogram(String str) {
        return str.toLowerCase().equals(Arrays.stream(str.toLowerCase().split(""))
                .distinct()
                .collect(Collectors.joining()));
    }
}
