package asafov.com;

public class Abbreviation {


    private static int[][] memoAr;
    private static final int TRUE = 1;
    private static final int UNKNOWN = 0;
    private static final int FALSE = -1;

    static String abbreviation(String strWithSmall, String strWithCapital) {
        memoAr = new int[strWithSmall.length()][strWithCapital.length()];
        return abbr(strWithSmall.toCharArray(), strWithCapital.toCharArray(), 0 , 0) ? "YES" : "NO";
    }

    static boolean abbr(char[] a, char[] b, int i, int j) {
        if (j == b.length) return tailIsLower(a, i);
        if (i == a.length) return false;
        if (memoAr[i][j] != UNKNOWN) return memoAr[i][j] == TRUE;

        boolean res = ((a[i] == b[j]) || (Character.toUpperCase(a[i]) == b[j])) && abbr(a, b, i + 1, j + 1)
                || Character.isLowerCase(a[i]) && abbr(a, b, i + 1, j);

        memoAr[i][j] = res ? TRUE : FALSE;
        return res;
    }

    private static boolean tailIsLower(char[] a, int i) {
        for (; i < a.length; i++) {
            if (Character.isUpperCase(a[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(abbreviation("daBcd","ABC"));
    }
}
