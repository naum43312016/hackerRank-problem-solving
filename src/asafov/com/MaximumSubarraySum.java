package asafov.com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MaximumSubarraySum {

    private static long getMaxSum(int n, long m, long[] arr) {
        long maxSum=0;

        TreeSet<Long> prefix = new TreeSet<Long>();
        long currentSum=0;
        for(int i=0;i<n;i++){
            currentSum=(currentSum+arr[i]%m)%m;
            SortedSet<Long> set = prefix.tailSet(currentSum+1);
            Iterator<Long> itr = set.iterator();
            if(itr.hasNext()){

                maxSum= Math.max(maxSum, (currentSum-itr.next()+m)%m);
            }

            maxSum=Math.max(maxSum, currentSum);
            prefix.add(currentSum);
        }


        return maxSum;
    }


    public static void main(String[] args) {

    }
}
