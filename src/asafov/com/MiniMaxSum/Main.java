package asafov.com.MiniMaxSum;

import java.util.Arrays;

public class Main {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        long sum = 0;
        for (int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        long min = 0;
        for (int i=0;i<arr.length-1;i++){
            min+=arr[i];
        }
        System.out.println(min +" " + sum);
    }
    public static void main(String[] args) {
        int[] arr = {256741038,623958417,467905213,714532089,938071625};
        miniMaxSum(arr);
    }
}
