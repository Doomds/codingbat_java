package warmup1;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }

    public static String missingChar(String str, int n) {

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c);
        }

        return sb.deleteCharAt(n).toString();
    }
}
