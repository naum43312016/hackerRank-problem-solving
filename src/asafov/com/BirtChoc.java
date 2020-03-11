package asafov.com;

import java.util.List;

public class BirtChoc {
    static int birthday(List<Integer> s, int d, int m) {
        int ans = 0;
        for (int i=0;i<s.size();i++){
            int j=0;
            int k=i;
            int sum = 0;
            while (j<m && k<s.size()){
                sum+=s.get(k);
                j++;
                k++;
            }
            if (sum==d){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
