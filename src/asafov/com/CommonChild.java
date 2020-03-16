package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class CommonChild {

    static int commonChild(String s1, String s2) {

        return lcs(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
    }
    /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
    static int lcs( char[] X, char[] Y, int m, int n )
    {
        int[][] L = new int[m + 1][n + 1];

    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }
        return L[m][n];
    }

    /* Utility function to get max of 2 integers */
    private static int max(int a, int b)
    {
        return (a > b)? a : b;
    }



    public static void main(String[] args) {
        System.out.println(commonChild("ABCD","ABDC"));
    }
}
