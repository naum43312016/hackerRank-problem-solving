package asafov.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are given  queries. Each query is of the form two integers described below:
- 1 : Insert x in your data structure.
- 2 : Delete one occurence of y from your data structure, if present.
- 3 : Check if any integer is present whose frequency is exactly . If yes, print 1 else 0.


 */
public class FrequencyQueries {

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(List<Integer> q : queries){
            int query = q.get(0);
            int val = q.get(1);
            if (query==1){
                if (map.containsKey(val)){
                    int freq = map.get(val);
                    map.put(val,freq+1);
                }else{
                    map.put(val,1);
                }
            }else if(query == 2){
                if (map.containsKey(val)){
                    int freq = map.get(val);
                    if (freq<2){
                        map.remove(val);
                    }else{
                        map.put(val,freq-1);
                    }

                }
            }else {//=3
                if (map.containsValue(val)){//O(n)
                    res.add(1);
                }else{
                    res.add(0);
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
