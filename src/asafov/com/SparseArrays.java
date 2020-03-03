package asafov.com;

import java.util.Arrays;

public class SparseArrays {
    static int[] matchingStrings(String[] strings, String[] queries) {
        if (strings==null || queries==null ||strings.length==0 || queries.length==0) return null;
        int[] res = new int[queries.length];
        for (int j=0;j<queries.length;j++){
            int count = 0;
            for (int i=0;i<strings.length;i++){
                if (queries[j].equals(strings[i])){
                    count++;
                }
            }
            res[j] = count;
        }
        return res;
    }
    public static void main(String[] args) {
        String[] strings = {"aba","baba","aba","xzxb"};
        String[] queries = {"aba","xzxb","ab"};
        int[] res = matchingStrings(strings,queries);
        System.out.println(Arrays.toString(res));
    }
}
