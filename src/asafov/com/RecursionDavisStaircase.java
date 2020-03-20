package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class RecursionDavisStaircase {
    static Map<Integer,Integer> map = new HashMap<>();
    static int stepPerms(int n) {
        return climb(n);
    }

    private static int climb(int n) {
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        if(!map.containsKey(n)) {
            int count = climb(n-1) + climb(n-2) + climb(n-3);
            map.put(n, count);
        }
        return map.get(n);
    }

    public static void main(String[] args) {

    }
}
