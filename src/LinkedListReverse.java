public class LinkedListReverse {

     class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;
      }


    static void reversePrint(SinglyLinkedListNode head) {
        Recursion(head);
    }

    private static void Recursion(SinglyLinkedListNode head){
         if (head==null) return;
         Recursion(head.next);
         System.out.println(head.data);
    }

    public static void main(String[] args) {

    }
}
