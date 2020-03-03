package asafov.com.com2DArray;

public class Main {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (j<arr[i].length-2 && i<arr.length-2) {
                    int sum = calculate(arr, i, j);
                    max = Math.max(max,sum);
                }
            }
        }
        return max;
    }
    private static int calculate(int[][] a,int i,int j){
        int s = 0;
        s+=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]+a[i+1][j+1];
        return s;
    }
    public static void main(String[] args) {
        /*
        1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
         */
        int[][] arr = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0,},{0,0,2,
        4,4,0},{0,0,0,2,0,0},{0,0,1,2,4
        ,0}};

        System.out.println(hourglassSum(arr));
    }
}
