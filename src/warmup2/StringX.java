package warmup2;

public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix")); // "xHix"
        System.out.println(stringX("abxxxcd")); // "abcd"
        System.out.println(stringX("xabxxxcdx")); // "xabcdx"
    }

    public static String stringX(String str) {
        if (str.length() < 2) return str;

        return str.charAt(0)
                + str.substring(1, str.length()-1).replace("x", "")
                + str.charAt(str.length()-1);
    }
}
