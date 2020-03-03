package asafov.com;
/*

 */
public class InsertNodeAtTail {

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


    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head==null){
            head=node;
        }else {
            SinglyLinkedListNode tmp = head;
            while (tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next = node;
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
