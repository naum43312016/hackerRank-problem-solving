package asafov.com.QueueusingTwoStacks;

import java.util.Deque;
import java.util.LinkedList;
/*
1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.

10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2
 */
public class Main {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        int n = 10;
        int[] query = {1,42,2,1,14,3,1,28,3,1,60,1,78,2,2};

        for (int i=0;i<query.length;i++){
            if (query[i]==1){
                i++;
                queue.addLast(query[i]);
            }else if(query[i]==2){
                queue.pollFirst();
            }else{
                System.out.println(queue.peekFirst());
            }
        }
    }
}
