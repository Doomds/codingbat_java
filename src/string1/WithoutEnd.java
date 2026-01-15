package string1;

public class WithoutEnd {
    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello")); // "ell"
        System.out.println(withoutEnd("java")); // "av"
        System.out.println(withoutEnd("coding")); // "odin"
    }

    public static String withoutEnd(String end) {
        return end.substring(1,end.length()-1);
    }
}
