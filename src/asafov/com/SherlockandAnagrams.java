package asafov.com;

import java.util.*;

/*
Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.

For example , the list of all anagrammatic pairs is  at positions  respectively.

Function Description

Complete the function sherlockAndAnagrams in the editor below. It must return an integer that represents the number of anagrammatic pairs of substrings in .

 */
public class SherlockandAnagrams {

    static int sherlockAndAnagrams(String s) {
        int ans=0;
        int let = 1;
        List<String> substrings=new ArrayList<>();
        Map<Integer, LinkedList<String>> map = new HashMap<>();
        while (let<s.length()){
            String subString = s.substring(0,let);

            substrings.add(subString);
            LinkedList<String> list = new LinkedList<>();
            list.add(subString);
            map.put(let,list);
            int j = s.length();
            while (j-let>0){
                list.add(s.substring(j-let,j));
                j--;
            }
            map.put(let,list);
            let++;
        }
        for (Map.Entry<Integer,LinkedList<String>> entry : map.entrySet()){
            LinkedList<String> l = entry.getValue();
            for (int i =0;i<l.size()-1;i++){
                String str = l.get(i);
                for (int j=i+1;j<l.size();j++){
                    if (isAnagram(str,l.get(j))){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    private static boolean isAnagram(String subString, String substring) {
        char[] s1Array = subString.toLowerCase().toCharArray();
        char[] s2Array = substring.toLowerCase().toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        int a = sherlockAndAnagrams("abba");
        System.out.println(a);
    }
}
