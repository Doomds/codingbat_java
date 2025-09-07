package warmup2;

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2)); // "ChoCho"
        System.out.println(frontTimes("Chocolate", 3)); // "ChoChoCho"
        System.out.println(frontTimes("Abc", 3)); // "AbcAbcAbc"
    }

    private static String frontTimes(String str, int n) {
        StringBuilder newStr = new StringBuilder();

        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                newStr.append(str);
            }
        } else {
            for (int i = 0; i < n; i++) {
                newStr.append(str.substring(0,3));
            }
        }
        return newStr.toString();
    }
}
