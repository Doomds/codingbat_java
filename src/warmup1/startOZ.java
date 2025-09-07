package warmup1;

public class startOZ {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias")); // "oz"
        System.out.println(startOz("bzoo")); // "z"
        System.out.println(startOz("oxx")); // "o"
        System.out.println(startOz("o")); // "o"
        System.out.println(startOz("")); // ""
    }

    private static String startOz(String str) {
        String result = "";

        if (str.length() >=1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) =='z') {
            result = result + str.charAt(1);
        }
        return result;
    }
}
