
public class InsertNodeAtPos {



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


    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if (position<0) return head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (position==0)
        {
            newNode.next = head;
            return newNode;
        }
        int i = 1;
        SinglyLinkedListNode n = head;
        while (i<position){
            n=n.next;
            i++;
        }
        newNode.next = n.next;
        n.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(16);
        n.next = new SinglyLinkedListNode(13);
        n.next.next = new SinglyLinkedListNode(7);
        System.out.println(insertNodeAtPosition(n,1,3));
    }
}
