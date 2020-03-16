package asafov.com;

public class SortingOne {
/*
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
 */
    static void countSwaps(int[] a) {
        int n = a.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(j, j+1,a);
                    swaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }

    private static void swap(int i, int i1,int[] a) {
        int t = a[i];
        a[i]=a[i1];
        a[i1]=t;
    }

    public static void main(String[] args) {
        int[] a={6,4,1};
        countSwaps(a);
    }
}
