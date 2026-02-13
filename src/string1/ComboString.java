package string1;

public class ComboString {
    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi")); // "hiHellohi"
        System.out.println(comboString("hi", "Hello")); // "hiHellohi"
        System.out.println(comboString("aaa", "b")); // "baaab"
    }

    public static String comboString(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        if (lengthA < lengthB) {
            return a + b + a;
        }

        return b + a + b;
    }
}
