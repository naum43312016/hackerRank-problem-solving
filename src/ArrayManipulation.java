import java.util.Arrays;
/*
Difficulty-Hard
Starting with a 1-indexed array of zeros and a list of operations, for each operation add
 a value to each of the array element between two given indices, inclusive.
 Once all operations have been performed, return the maximum value in your array.

For example, the length of your array of zeros . Your list of queries is as follows:

    a b k
    1 5 3
    4 8 7
    6 9 1
Add the values of  between the indices  and  inclusive:

index->	 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]
The largest value is  after all operations are performed.

Function Description

Complete the function arrayManipulation in the editor below. It must return an integer, the maximum value in the resulting array.

arrayManipulation has the following parameters:

n - the number of elements in your array
queries - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.

 */
//a the left index, b right index and k summand
public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n+1];


        for (int i = 0; i < queries.length; i++) {
            arr[queries[i][0]-1] += queries[i][2];
            if (queries[i][1] < arr.length) {
                arr[queries[i][1]] -= queries[i][2];
            }
        }
        long max = arr[0];
        for (int j = 1; j < n; j++) {
            arr[j] += arr[j-1];
            max = Math.max(max, arr[j]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] q = {{1,2,100},{2,5,100},{3,4,100}};
        System.out.println(arrayManipulation(5,q));
    }
}
