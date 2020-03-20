package asafov.com;

public class MaxArraySum {

    static int maxSubsetSum(int[] arr) {
        int[] ans = new int[arr.length];

        ans[0]=arr[0];
        ans[1] = Math.max(arr[0],arr[1]);

        int i=2;
        while (i<arr.length){
            ans[i] = Math.max(Math.max(arr[i]+ans[i-2],ans[i-1]),arr[i]);
            i++;
        }

        return ans[ans.length-1];
    }

    public static void main(String[] args) {
        int[] a = {-2,1,3,-4,5};
        System.out.println(maxSubsetSum(a));
    }
}
