package array1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakePi {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makePi())); // [3, 1, 4]
    }

    public static int[] makePi(){
        return new int[]{3, 1, 4};
    }
}
