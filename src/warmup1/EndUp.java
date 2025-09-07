package warmup1;

public class EndUp {
    public static void main(String[] args) {
        System.out.println(endUp("Hello")); // "HeLLO"
        System.out.println(endUp("hi there")); // "hi thERE"
        System.out.println(endUp("hi")); // "HI"
    }

    private static String endUp(String str) {

        if (str.length() < 3) {
            return str.toUpperCase();
        }

        String upper = str.substring(str.length() - 3).toUpperCase();

        return str.substring(0, str.length()-3) + upper;
    }
}
