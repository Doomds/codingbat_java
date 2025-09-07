package warmup1;

public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11, 19)); // 19
        System.out.println(max1020(19, 11)); // 19
        System.out.println(max1020(11, 9)); // 11
        System.out.println(max1020(10, 21)); // 10
        System.out.println(max1020(21, 10)); // 10
        System.out.println(max1020(23, 10)); // 10
    }

    private static int max1020(int a, int b) {
        boolean inRangeA = (a >= 10 && a <= 20);
        boolean inRangeB = (b >= 10 && b <= 20);

        if (inRangeA && inRangeB) {
            return Math.max(a, b);
        }
        if (inRangeA) {
            return a;
        }
        if (inRangeB) {
            return b;
        }
        return 0;
    }
}
