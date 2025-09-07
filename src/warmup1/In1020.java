package warmup1;

public class In1020 {
    public static void main(String[] args) {
        System.out.println(in1020(12, 99)); // true
        System.out.println(in1020(21, 12)); // true
        System.out.println(in1020(8, 99)); // false
    }

    public static boolean in1020(int a, int b) {
        return (a > 9 && a < 21) || (b > 9 && b < 21);
    }
}
