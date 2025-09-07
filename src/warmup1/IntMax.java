package warmup1;

public class IntMax {
    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3)); // 3
        System.out.println(intMax(1, 3, 2)); // 3
        System.out.println(intMax(3, 2, 1)); // 3
    }

    private static int intMax(int a, int b, int c) {
        int largest = Math.max(a, b);
        return Math.max(largest, c);
    }

}
