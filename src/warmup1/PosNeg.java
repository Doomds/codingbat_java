package warmup1;

public class PosNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(-1, 1, true)); // false
        System.out.println(posNeg(1,-1,true)); // false
        System.out.println(posNeg(-4, 5, true)); // false
        System.out.println(posNeg(-5, 6, true)); // false
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        return (a > 0 && b < 0) || (a < 0 && b > 0);
    }
}
