package asafov.com.MinAbsoluteDifferenceinanArray;

import java.util.*;

public class Main {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int minimumDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int difference = arr[i + 1] - arr[i];

            if (difference < minimumDifference) {
                minimumDifference = difference;

                if (minimumDifference == 0) {
                    return 0;
                }
            }
        }

        return minimumDifference;

    }

    public static void main(String[] args) {

    }
}
