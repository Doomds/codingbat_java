package warmup1;

public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2)); // "Mrce"
        System.out.println(everyNth("abcdefg", 2)); // "aceg"
        System.out.println(everyNth("abcdefg", 3)); // "adg"
    }

    private static String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
