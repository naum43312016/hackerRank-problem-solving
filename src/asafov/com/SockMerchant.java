package asafov.com;

import java.util.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<ar.length;i++){
            if(set.contains(ar[i])){
                res++;
                set.remove(ar[i]);
            }else{
                set.add(ar[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
