package asafov.com;

import java.util.Arrays;

public class MinimumSwapsTwo {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int[] temp = new int[arr.length+1];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]=i;
        }
        System.out.println(Arrays.toString(temp));
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]!=i+1){
                int val = arr[i];
                arr[i] = i+1;
                arr[temp[i+1]]=val;
                temp[val]=temp[i+1];
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {7,1,3,2,4,5,6};
        System.out.println(minimumSwaps(a));
    }
}
