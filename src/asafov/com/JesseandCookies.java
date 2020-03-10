package asafov.com;

import java.util.*;

//sweetness  Least sweet cookie   2nd least sweet cookie).
public class JesseandCookies {

    static int cookies(int k, int[] A) {
        /*
         * Write your code here.
         */
        int operations = 0;
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();

        for(int i = 0; i < A.length; i++) {
            que.add(A[i]);
        }


        while(que.size() > 1 && que.peek() < k) {
            int leastSweet = que.poll();
            int secondLeast = que.poll();

            que.add(leastSweet + 2*secondLeast);
            operations++;
        }


        if(que.peek() < k) {
            return -1;
        } else {
            return operations;
        }
    }

    public static void main(String[] args) {
        //int[] a = {1,2,3,9,10,12};
        int[] a = {13, 47, 74 ,12, 89, 74, 18, 38};
        System.out.println(cookies(90,a));
    }
}
