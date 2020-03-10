package asafov.com;

import java.util.Scanner;
import java.util.TreeSet;

public class Qheap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int j = scanner.nextInt();
        int i = 0;
        while(i<j){
            int q = scanner.nextInt();
            if(q==1){
                int val = scanner.nextInt();
                set.add(val);
            }else if(q==2){
                int val = scanner.nextInt();
                set.remove(val);
            }else if(q==3){
                System.out.println(set.first());
            }
            i++;
        }
        scanner.close();
    }
}
