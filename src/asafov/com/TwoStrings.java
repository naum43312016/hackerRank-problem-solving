package asafov.com;

import java.util.HashSet;
import java.util.Set;

/*
Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring.

Function Description

Complete the function twoStrings in the editor below. It should return a string, either YES or NO based on whether the strings share a common substring.

twoStrings has the following parameter(s):

s1, s2: two strings to analyze .

 */
public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (int i=0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }
        for (int i=0;i<s2.length();i++){
            if (set.contains(s2.charAt(i))){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {

    }
}
