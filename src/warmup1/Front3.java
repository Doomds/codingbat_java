package warmup1;

public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("Java")); // "JavJavJav"
        System.out.println(front3("Chocolate")); // "ChoChoCho"
        System.out.println(front3("abc")); // "abcabcabc"
    }

    public static String front3(String str) {
        String first3;
        if (str.length() < 3) {
            first3 = str;
        }

        first3 = str.substring(0, 3);

        return first3 + first3 + first3;
    }
}
