package warmup1;

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
        System.out.println(frontBack(""));
    }

    public static String frontBack(String str) {

        if (str == "") {
            return "";
        }

        char[] charArray = str.toCharArray();
        char firstChar = charArray[0];
        char lastChar = charArray[charArray.length - 1];

        charArray[0] = lastChar;
        charArray[charArray.length - 1] = firstChar;

        return new String(charArray);
    }
}

/* SOLUTION
*public String frontBack(String str) {
  if (str.length() <= 1) return str;

  String mid = str.substring(1, str.length()-1);

  // last + mid + first
  return str.charAt(str.length()-1) + mid + str.charAt(0);
}
* */
