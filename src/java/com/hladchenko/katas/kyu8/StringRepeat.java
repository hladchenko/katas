/*
  String repeat

  Write a function called repeatStr which repeats the given string string exactly n times.

  repeatStr(6, "I") // "IIIIII"
  repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 */

package com.hladchenko.katas.kyu8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
