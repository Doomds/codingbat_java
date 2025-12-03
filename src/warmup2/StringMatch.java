package warmup2;

public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz")); // 3
        System.out.println(stringMatch("abc", "abc")); // 2
        System.out.println(stringMatch("abc", "axc")); // 0

        System.out.println(stringMatch("aabbccdd", "abbbxxd")); // 1
        System.out.println(stringMatch("aaxxaaxx", "iaxxai")); // 3
        System.out.println(stringMatch("iaxxai", "aaxxaaxx")); // 3
    }

    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len-1; i++) {
            if (a.substring(i, i+2).equals(b.substring(i, i+2))) {
                count++;
            }
        }

        return count;
    }
}
