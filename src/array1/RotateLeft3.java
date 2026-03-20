package array1;

import java.util.Arrays;

public class RotateLeft3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft3(new int[]{1, 2, 3}))); // [2, 3, 1]
        System.out.println(Arrays.toString(rotateLeft3(new int[]{5, 11, 9}))); // [11, 9, 5]
        System.out.println(Arrays.toString(rotateLeft3(new int[]{7, 0, 0}))); // [0, 0, 7]
    }

    public static int[] rotateLeft3(int[] nums) {


        int[] newArray =  new int[nums.length];


        System.out.println("----");
        System.out.println("nums : ");
        System.out.println(Arrays.toString(nums));
        System.out.println("-----");

        return newArray;
    }

}
