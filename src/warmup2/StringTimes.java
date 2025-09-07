package warmup2;

public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2)); // "HiHi"
        System.out.println(stringTimes("Hi", 3)); // "HiHiHi"
        System.out.println(stringTimes("Hi", 1)); // "Hi"
    }

    private static String stringTimes(String str, int n) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < n; i++) {
            newStr.append(str);
        }
        return newStr.toString();

        // Fonctionne aussi avec return str.repeat(n); mais n'est pas accepté par CodingBat.
    }
}
