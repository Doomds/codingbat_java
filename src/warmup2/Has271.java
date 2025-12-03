package warmup2;

public class Has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 7, 1})); // true
        System.out.println(has271(new int[]{1, 2, 8, 1})); // false
        System.out.println(has271(new int[]{2, 7, 1})); // true
    }

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            if (b == a + 5 && Math.abs(c - (a - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}
