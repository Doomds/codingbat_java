package warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        StringBuilder newStr = new StringBuilder();

        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                newStr.append(str);
            }
        } else {
            for (int i = 0; i < n; i++) {
                newStr.append(str.substring(0,3));
            }
        }
        return newStr.toString();
    }

}
