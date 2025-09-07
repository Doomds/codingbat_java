package warmup1;

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten")); // "kikittenki"
        System.out.println(front22("Ha")); // "HaHaHa"
        System.out.println(front22("abc")); // "ababcab"
        System.out.println(front22("a")); // "aaa"
        System.out.println(front22("")); // ""

    }

    public static String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        
        String first2 = str.substring(0, 2);

        return first2 + str + first2;
    }

}
