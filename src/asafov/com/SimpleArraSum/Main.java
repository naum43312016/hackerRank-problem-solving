package asafov.com.SimpleArraSum;

public class Main {
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum =0;
        for (int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
