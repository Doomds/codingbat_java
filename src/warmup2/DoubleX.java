package warmup2;

public class DoubleX {

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb")); // true
        System.out.println(doubleX("axaxax")); // false
        System.out.println(doubleX("xxxxx")); // true
    }

    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        String x = str.substring(i);
        return x.startsWith("xx");
    }
}
