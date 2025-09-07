package warmup1;

public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("hi there")); // true
        System.out.println(startHi("hi")); // true
        System.out.println(startHi("hello hi")); // false
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }
}
