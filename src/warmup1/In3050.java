package warmup1;

public class In3050 {
    public static void main(String[] args) {
        System.out.println(in3050(30, 31)); // true
        System.out.println(in3050(30, 41)); // false
        System.out.println(in3050(40, 50)); // true
    }

    private static boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40))
                || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }
}
