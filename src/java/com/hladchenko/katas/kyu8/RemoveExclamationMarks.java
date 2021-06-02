/*
  Remove exclamation marks

  Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 */

package com.hladchenko.katas.kyu8;

class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}