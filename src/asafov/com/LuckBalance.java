package asafov.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {
        int ans = 0;
        int imp = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<contests.length;i++){
            if (contests[i][1]==1){
                list.add(contests[i][0]);
                imp++;
            }
            ans+=contests[i][0];
        }
        if (imp<=k) return ans;
        int j = imp-k;
        int i = 0;
        Collections.sort(list);
        while (j>0){
            ans-=list.get(i);
            ans-=list.get(i);
            j--;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
