package asafov.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTablesIceCreamParlor {


    static void whatFlavors(int[] cost, int money) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<cost.length;i++){
            int currIndex = i+1;
            if (map.containsKey(money-cost[i])){
                System.out.println(map.get(money-cost[i]) + " " + currIndex);
            }else{
                map.put(cost[i],currIndex);
            }
        }

    }

    public static void main(String[] args) {

    }
}
