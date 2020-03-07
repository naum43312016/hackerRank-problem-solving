package asafov.com.InsertingNodeIntoSortedDoublLinkList;

public class Main {


      private static class DoublyLinkedListNode {
          int data;
          DoublyLinkedListNode next;
          DoublyLinkedListNode prev;

          public DoublyLinkedListNode(int data) {
              this.data = data;
          }
      }


    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode node = head;
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (data<head.data){
            newNode.next=head;
            return newNode;
        }
        while (node.next!=null){
            if (node.next.data>data){
                newNode.next=node.next;
                newNode.prev=node;
                node.next=newNode;
                return head;
            }
            node=node.next;
        }
        newNode.prev=node;
        node.next=newNode;
        return head;
    }

    public static void main(String[] args) {

    }
}
