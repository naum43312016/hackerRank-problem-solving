package asafov.com;
/*
Lilah has a string, , of lowercase English letters that she repeated infinitely many times.

Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider

 */
/*
Sample Input 0

aba
10
Sample Output 0

7

abaabaabaa

abs
absabsabsa

baa
baabaabaab

baab
baabbaabba
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        if (s.length()==0) return 0;
        if (s.length()==1){
            if (s.charAt(0)=='a'){
                return n;
            }else{
                return 0;
            }
        }


        if (n<s.length()){
            int i=0;
            long ans=0;
            while(i<n){
                if (s.charAt(i)=='a'){
                    ans++;
                }
                i++;
            }
            return ans;
        }

        long len = s.length();
        if (n%len==0){
            long mul = n/len;
            char c = 'a';
            long res = 0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)==c){
                    res++;
                }
            }
            if (res==0) return 0;
            return res*mul;
        }else{
            long k = n/len;
            long o = n%len;//ostatok
            char c = 'a';
            long res = 0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)==c){
                    res++;
                }
            }
            res = res*k;
            int j=0;
            while (j<o){
                if (s.charAt(j)==c){
                    res++;
                }
                j++;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(10%3);
    }
}
