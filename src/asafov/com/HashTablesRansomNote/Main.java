package asafov.com.HashTablesRansomNote;

import java.util.*;

public class Main {

    static void checkMagazine(String[] magazine, String[] note) {
        if (note.length>magazine.length){
            System.out.println("No");
            return;
        }
        Map<String,Integer> set = new HashMap<>();
        for (String s:magazine){
            if (set.containsKey(s)){
                set.put(s,set.get(s)+1);
            }else{
                set.put(s,1);
            }
        }
        for (String s :note){
            if (!set.containsKey(s)){
                System.out.println("No");
                return;
            }else{
                int i = set.get(s);
                if (i<1){
                    System.out.println("No");
                    return;
                }
                set.put(s,set.get(s)-1);
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
    }
}
