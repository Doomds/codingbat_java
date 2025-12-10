package array1;

public class SameFirstLast {
    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[]{1, 2, 3})); // false
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1})); // true
        System.out.println(sameFirstLast(new int[]{1, 2, 1})); // true
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length >=1 && nums[0] == nums[nums.length-1];
    }
}
