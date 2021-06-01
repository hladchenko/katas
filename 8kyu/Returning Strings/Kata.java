/**
 * Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
 */

public class Kata
{
    public static String greet(String name)
    {
        return String.format("Hello, %s how are you doing today?", name);
    }
}