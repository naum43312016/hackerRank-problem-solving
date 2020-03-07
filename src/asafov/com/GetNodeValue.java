package asafov.com;

public class GetNodeValue {

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

      private static int res = 0;
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        rec(head,positionFromTail);
        return res;
    }

    private static int rec(SinglyLinkedListNode head,int positionFromTail){
          if (head==null) return positionFromTail;
          int t = rec(head.next,positionFromTail);
          if (t == 0) res=head.data;
          return t-1;

    }
    public static void main(String[] args) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(3);
        //n.next = new SinglyLinkedListNode(2);
        //n.next.next = new SinglyLinkedListNode(1);
        System.out.println(getNode(n,1));

    }
}
