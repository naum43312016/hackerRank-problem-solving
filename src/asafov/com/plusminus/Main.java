package asafov.com.plusminus;
/*
Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

For example, given the array  there are  elements, two positive, two negative and one zero. Their ratios would be ,  and . It should be printed as

0.400000
0.400000
0.200000

 */
import java.text.DecimalFormat;

public class Main {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("0.000000");
        double len = arr.length;
        int pos=0,neg=0,zero=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                zero++;
            }else if (arr[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println(df.format(pos/len));
        System.out.println(df.format(neg/len));
        System.out.println(df.format(zero/len));
    }
    public static void main(String[] args) {
        double d = 2.0/5.0;
        int[] arr = {-4,3,-9,0,4,1};
        plusMinus(arr);
    }
}
