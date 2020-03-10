package asafov.com;

import java.util.Arrays;
import java.util.List;

public class EqualStacks {

    private static void reverse(int[] array){
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
    }
    public static boolean contains(final int[] array, final int v) {
        boolean result = false;
        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }
        return result;
    }
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */
        reverse(h1);
        reverse(h2);
        reverse(h3);
        for (int i=h1.length-1;i>=0;i--){
            int sum = 0;
            for (int j=i;j>=0;j--){
                sum+=h1[j];
            }
            h1[i]=sum;
        }
        for (int i=h2.length-1;i>=0;i--){
            int sum = 0;
            for (int j=i;j>=0;j--){
                sum+=h2[j];
            }
            h2[i]=sum;
        }
        for (int i=h3.length-1;i>=0;i--){
            int sum = 0;
            for (int j=i;j>=0;j--){
                sum+=h3[j];
            }
            h3[i]=sum;
        }
        System.out.println(Arrays.toString(h1));
        reverse(h1);
        reverse(h2);
        reverse(h3);
        int size1 = h1.length;
        int size2 = h2.length;
        int size3 = h3.length;

        if (size1==size2 && size1==size3){
            for (int i=0;i<size1;i++){
                //h1
                if (contains(h2,h1[i]) && contains(h3,h1[i])){
                    return h1[i];
                }
            }
        }else if(size1<size2 && size1< size3){
            for (int i=0;i<size1;i++){
                //h1
                if (contains(h2,h1[i]) && contains(h3,h1[i])){
                    return h1[i];
                }
            }
        }else if(size2<size1 && size2< size3){
            for (int i=0;i<size2;i++){
                //h1
                if (contains(h1,h2[i]) && contains(h3,h2[i])){
                    return h2[i];
                }
            }
        }else if(size3<size1 && size3< size2){
            for (int i=0;i<size3;i++){
                //h1
                if (contains(h2,h3[i]) && contains(h1,h3[i])){
                    return h3[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] h1 = {3,2,1,1,1};
        int[] h2 = {4,3,2};
        int[] h3 = {1,1,4,1};
        //System.out.println(Arrays.toString(h1));
        System.out.println(equalStacks(h1,h2,h3));
    }
}
