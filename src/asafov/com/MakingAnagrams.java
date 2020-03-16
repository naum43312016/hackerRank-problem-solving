package asafov.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

For example, if  and , we can delete  from string  and  from string  so that both remaining strings are  and  which are anagrams.


 */
public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        if (a.length()==0){
            return b.length();
        }
        if (b.length()==0){
            return a.length();
        }
        return count(a,b);
    }

    private static int count(String a, String b) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<a.length();i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        int countSim = 0;
        for (int i=0;i<b.length();i++){
            char c = b.charAt(i);
            if (map.containsKey(c) && map.get(c)>0){
                countSim++;
                map.put(c,map.get(c)-1);
            }
        }
        return (a.length()-countSim) + (b.length()-countSim);
    }

    public static void main(String[] args) {
        String s = "cde";
        String s2 = "abc";
        System.out.println(makeAnagram(s,s2));
    }
}
