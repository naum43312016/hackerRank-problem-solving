package asafov.com;

public class LeftRotation {
    public static void main(String[] args) {
        int[] a = {1 ,2 ,3, 4, 5};
        for (int j = 0;j<4;j++){
            Sol(a);
        }

        print(a);
    }

    private static void Sol(int[] a){
        int val = a[a.length-1];
        int n = a.length;
        for(int i=n-1;i>=0;i--){
            if (i==0){
                int t = a[n-1];
                a[n-1] = val;
                val = t;
            }else {
                int t = a[i - 1];
                a[i - 1] = val;
                val = t;
            }
        }
    }

    private static void print(int[] a){
        for (int i=0;i<a.length;i++){
            if (i!=0){
                System.out.print(" " +a[i]);
            }else{
                System.out.print(a[i]);
            }
        }
    }

}
