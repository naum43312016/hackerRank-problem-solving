package asafov.com.divide;

import java.util.*;

public class Main {
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    /*
    [2, 4]
[16, 32, 96]
     */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        if (a==null || b ==null || a.size()==0 || b.size() ==0) return 0;
        Collections.sort(a);
        Collections.sort(b);
        int result=0;
        int num = a.get(a.size()-1);
        while (num<=b.get(0)){
            boolean flag = true;
            for (int i =0;i<a.size();i++){
                if (num%a.get(i)!=0){
                    flag=false;
                    break;
                }
            }
            for (int i =0;i<b.size();i++){
                if (b.get(i)%num!=0){
                    flag=false;
                    break;
                }
            }
            if (flag) result++;
            num++;
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(4);
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a,b));
    }
}
