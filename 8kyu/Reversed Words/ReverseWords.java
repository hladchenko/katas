/**
 * Complete the solution so that it reverses all of the words within the string passed in.
 * Example:
 * "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String reverseWords(String str) {
        List<String> arrayList = new ArrayList<>(List.of(str.split(" ")));
        Collections.reverse(arrayList);
        return String.join(" ", arrayList);
    }
}