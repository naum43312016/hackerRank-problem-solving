package asafov.com;

public class DeleteaNode {
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


    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

          if(head==null){
              return null;
          }
          if (position==0){
              if (head.next!=null){
                  return head.next;
              }else {
                  return null;
              }
          }

          SinglyLinkedListNode node = head;
          int i = 1;
          while (i!=position){
              node = node.next;
              i++;
          }
          if (node.next.next==null){
              node.next=null;
          }else {
              node.next = node.next.next;
          }

          return head;
    }
    public static void main(String[] args) {
        SinglyLinkedListNode root = new SinglyLinkedListNode(1);
        root.next = new SinglyLinkedListNode(2);
        root.next.next = new SinglyLinkedListNode(3);
        root.next.next.next = new SinglyLinkedListNode(4);
        root.next.next.next.next = new SinglyLinkedListNode(5);
        SinglyLinkedListNode n = deleteNode(root,4);
        System.out.println(n);
    }
}
