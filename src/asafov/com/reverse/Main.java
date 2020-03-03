package asafov.com.reverse;

public class Main {
    static int[] reverseArray(int[] a) {
        int[] res = new int[a.length];
        int i=0;
        int j = a.length-1;
        while (i<a.length){
            res[i] = a[j];
            i++;
            j--;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
