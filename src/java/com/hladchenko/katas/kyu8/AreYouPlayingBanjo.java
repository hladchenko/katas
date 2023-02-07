package com.hladchenko.katas.kyu8;

/**
 * Create a function which answers the question "Are you playing banjo?". If your name starts with
 * the letter "R" or lower case "r", you are playing banjo!
 * <p>
 * The function takes a name as its only argument, and returns one of the following strings:
 * <p>
 * name + " plays banjo" name + " does not play banjo" Names given are always valid strings.
 *
 * @see <a href="https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java">Are You Playing
 * Banjo?</a>
 */
public class AreYouPlayingBanjo {

  public static String areYouPlayingBanjo(String name) {
    return name
        .substring(0, 1)
        .equalsIgnoreCase("r")
        ? name + " plays banjo"
        : name + " does not play banjo";
  }
}
