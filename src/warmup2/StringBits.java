package warmup2;

public class StringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello")); // "Hlo"
        System.out.println(stringBits("Hi")); // "H"
        System.out.println(stringBits("Heeololeo")); // "Hello"
    }

    public static String stringBits(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i+=2) {
            result = result + str.substring(i,i+1);
        }
        return result;
    }
}
