package warmup2;

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code")); // "CCoCodCode"
        System.out.println(stringSplosion("abc")); // "aababc"
        System.out.println(stringSplosion("ab")); // "aab"
    }

    public static String stringSplosion(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i+1);
        }
        return result;
    }
}
