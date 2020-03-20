package asafov.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Triplesum {

    static long triplets(int[] a, int[] b, int[] c) {

        Arrays.sort(a);
        a=Arrays.stream(a).distinct().toArray();
        Arrays.sort(b);
        b=Arrays.stream(b).distinct().toArray();
        Arrays.sort(c);
        c=Arrays.stream(c).distinct().toArray();
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        long result = 0;

        while(bIndex<b.length){
            while(aIndex<a.length && a[aIndex]<=b[bIndex])
                aIndex++;

            while(cIndex<c.length && c[cIndex]<=b[bIndex])
                cIndex++;

            // you should convert int to long first,
            // avoid int overflow and lead to fail the test case 4
            result += ((long)aIndex)*((long)cIndex);
            bIndex++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1,4,5};
        int[] b = {2,3,3};
        int[] c = {1,2,3};
        System.out.println(triplets(a,b,c));
    }
}
