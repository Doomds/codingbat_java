package warmup1;

public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello")); // true
        System.out.println(stringE("Heelle")); // true
        System.out.println(stringE("Heelele")); // false
    }

    private static boolean stringE(String str) {

        int count = 0;

        for (char c : str.toCharArray()) {
            if ( c == 'e') {
                count++;
            }
        }

        return (count >= 1 && count <= 3);
    }


}
