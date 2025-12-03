package warmup2;

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten")); // "kien"
        System.out.println(altPairs("Chocolate")); // "Chole"
        System.out.println(altPairs("CodingHorror")); // "Congrr"
        System.out.println(altPairs("yak")); // "ya"
    }

    public static String altPairs(String str) {

        if (str.length() < 2) return str;

        String newStr = "";

        for (int i = 0; i < str.length()-1; i+=4) {
            String twoChars = str.substring(i, i+2);
            newStr += twoChars;
        }

        return ((str.length() % 2) != 0 && str.length() > 3) ? newStr + str.substring(str.length()-1) : newStr;
    }

    /* EXAMPLE WITH STRINGBUILDER

    public static StringBuilder altPairs(String str) {

        if (str.length() < 2) return new StringBuilder(str);

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length()-1; i+=4) {
            String twoChars = str.substring(i, i+2);
            newStr.append(twoChars);
        }

        return new StringBuilder(((str.length() % 2) != 0 && str.length() > 3) ? newStr + str.substring(str.length() - 1) : newStr);
    }
    */
}
