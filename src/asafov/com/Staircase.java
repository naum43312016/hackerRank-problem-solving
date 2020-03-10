package asafov.com;

public class Staircase {

    static void staircase(int n) {

        int i = 1;
        while (i<=n){
            int j = n-i;
            while (j>0){
                System.out.print(" ");
                j--;
            }
            int k = i;
            while (k>0){
                System.out.print("#");
                k--;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        staircase(4);
    }
}
