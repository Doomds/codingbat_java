package logic1;

public class CigarParty {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); // false
        System.out.println(cigarParty(50, false)); // true
        System.out.println(cigarParty(70, true)); // true
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return ((cigars >= 40 && cigars <= 60) && !isWeekend) || (cigars >= 40 && isWeekend);
    }
}
