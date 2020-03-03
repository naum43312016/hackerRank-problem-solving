package asafov.com.BirthdayCakeCandle;

import java.util.Arrays;

public class Main {

    static int birthdayCakeCandles(int[] ar) {
        int ans = 0;
        if (ar.length==1) return 1;
        Arrays.sort(ar);
        int max = ar[ar.length-1];
        for (int i=ar.length-1;i>=0;i--){
            if (ar[i]!=max) break;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,3};
        System.out.println(birthdayCakeCandles(arr));
    }
}
