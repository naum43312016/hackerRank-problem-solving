package asafov.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pairs {

    static int pairs(int k, int[] arr) {
        int ans = 0;
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
            if (set.contains(arr[i]-k)){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
