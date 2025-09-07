package warmup1;

public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc")); // "abc"
        System.out.println(delDel("adelHello")); // "aHello"
        System.out.println(delDel("adedbc")); // "adedbc"
    }

    private static String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0,1) + str.substring(4);
        }

        return str;
    }


}
