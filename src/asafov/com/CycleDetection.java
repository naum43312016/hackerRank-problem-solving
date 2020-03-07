package asafov.com;

import java.util.HashSet;
import java.util.Set;

public class CycleDetection {

      private static class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;

          public SinglyLinkedListNode(int data) {
              this.data = data;
          }

          @Override
          public String toString() {
              return "SinglyLinkedListNode{" +
                      "data=" + data +
                      ", next=" + next +
                      '}';
          }
      }


    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head==null) return false;
        SinglyLinkedListNode node = head;
        Set<SinglyLinkedListNode> set = new HashSet<>();
        while (node!=null){
            if (set.contains(node)) return true;
            set.add(node);
            node=node.next;
        }
        return false;
    }
    public static void main(String[] args) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(16);
        n.next = new SinglyLinkedListNode(13);
        n.next.next = new SinglyLinkedListNode(7);
        //n.next.next.next = n;
        System.out.println(hasCycle(n));
    }
}
