package asafov.com;

import java.util.Arrays;

/*
HackerRank
Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  All the children sit in a line and each of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.

For example, assume her students' ratings are [4, 6, 4, 5, 6, 2]. She gives the students candy in the following minimal amounts: [1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies.

Function Description

Complete the candies function in the editor below. It must return the minimum number of candies Alice must buy.

candies has the following parameter(s):

n: an integer, the number of children in the class
arr: an array of integers representing the ratings of each student

 */
public class DPCandies {

    static long candies(int n, int[] arr) {
        if (arr.length==1) return 1;

        int[] candies = new int[arr.length];
        candies[0]=1;
        for (int i = 1; i < arr.length; i++){
            candies[i] = 1;
            if (arr[i] > arr[i - 1])
                candies[i] = candies[i - 1] + 1;
        }

// search reverse sequences
        for (int i = arr.length - 1; i > 0; i--){
            if (arr[i] < arr[i - 1])
                candies[i - 1] = Math.max(candies[i - 1], candies[i] + 1);
        }

        long sum = 0;
        for (int i= 0; i < candies.length; i++){
            sum += candies[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]a = {4, 6, 4, 5, 6, 2};
        System.out.println(candies(a.length,a));
    }
}