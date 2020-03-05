package asafov.com;

public class ReverseLinkedList {

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


    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head==null) return null;
        if (head.next==null) return head;

        return RecursiveReverse(head);
    }

    private static SinglyLinkedListNode RecursiveReverse(SinglyLinkedListNode head) {
         if (head==null) return null;
         SinglyLinkedListNode res = RecursiveReverse(head.next);
         SinglyLinkedListNode n = new SinglyLinkedListNode(head.data);
         if (res==null){
             res = n;
         }else{
             SinglyLinkedListNode t = res;
             while (t.next!=null){
                 t=t.next;
             }
             t.next=n;
         }

         return res;

    }

    public static void main(String[] args) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(16);
        n.next = new SinglyLinkedListNode(13);
        n.next.next = new SinglyLinkedListNode(7);
        System.out.println(reverse(n));
    }
}
