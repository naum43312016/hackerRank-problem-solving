package asafov.com;

import java.util.Arrays;

public class MaxMin {

    static int maxMin(int k, int[] arr) {
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for (int i=0;i<=arr.length-k;i++){
            int mi = arr[i];
            int max = arr[i+k-1];
            min = Math.min(min,max-mi);
        }
        return min;
    }


    public static void main(String[] args) {
        int[] a = {100,200,300,350,400,401,402};
        System.out.println(maxMin(3,a));

    }
}
