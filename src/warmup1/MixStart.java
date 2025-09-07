package warmup1;

public class MixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks")); // true
        System.out.println(mixStart("pix snacks")); // true
        System.out.println(mixStart("piz snacks")); // false
    }

    private static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        return str.substring(1,3).equals("ix");
    }

}
