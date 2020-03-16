package asafov.com;

import java.util.*;

public class SpecialStringAgain {

    static long substrCount(int n, String s) {
        if (s==null || s.length()==0) return 0;
        if (s.length()==1) return 1;
        long ans = s.length();

        int let = 2;
        while (let<=s.length()){
            if (isSpecial(let,s.substring(0,let))){
                ans++;
            }
            int j = s.length();
            while (j-let>0){
                if (isSpecial(let,s.substring(j-let,j))){
                    ans++;
                }
                j--;
            }
            let++;
        }
        return ans;
    }

    private static boolean isSpecial(int n,String str){
        if (n%2==0){
            char c = str.charAt(0);
            int i=1;
            while (i<str.length()){
                if (str.charAt(i)!=c){
                    return false;
                }
                i++;
            }
        }else{
            int mid = n/2;
            char c = str.charAt(0);
            int i=1;
            while (i<str.length()){
                if (str.charAt(i)!=c && i!=mid){
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(substrCount(0,"aaaa"));
    }
}
