package warmup1;

public class Close10 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13)); // 8
        System.out.println(close10(13, 8)); // 8
        System.out.println(close10(13, 7)); // 0
    }

    private static int close10(int a, int b) {
        int aResult = Math.abs(a - 10);
        int bResult = Math.abs(b - 10);

        if (aResult < bResult) {
            return a;
        }
        if (bResult < aResult) {
            return b;
        }
        return 0;
    }
}
