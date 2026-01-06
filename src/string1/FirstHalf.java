package string1;

public class FirstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo")); // "Woo"
        System.out.println(firstHalf("HelloThere")); // "Hello"
        System.out.println(firstHalf("abcdef")); // "abc"
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
