package asafov.com;

public class InsertNodeAtHead {


     private static class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;

         public SinglyLinkedListNode(int data) {
             this.data = data;
         }
     }


    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(data);
        if (llist!=null){
            head.next = llist;
        }
        return head;
    }
    public static void main(String[] args) {

    }
}
