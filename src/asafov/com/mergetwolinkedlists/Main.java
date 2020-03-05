package asafov.com.mergetwolinkedlists;

public class Main {

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


    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1==null && head2 == null){
            return null;
        }
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        SinglyLinkedListNode res = null;
        if (head1.data <= head2.data){
            res = new SinglyLinkedListNode(head1.data);
            head1=head1.next;
        }else {
            res = new SinglyLinkedListNode(head2.data);
            head2=head2.next;
        }
        SinglyLinkedListNode temp = res;
        while (head1 !=null && head2 != null){
            if (head1.data <= head2.data){
                temp.next = new SinglyLinkedListNode(head1.data);
                head1=head1.next;
                temp=temp.next;
            }else {
                temp.next = new SinglyLinkedListNode(head2.data);
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1!=null){
            temp.next = new SinglyLinkedListNode(head1.data);
            head1=head1.next;
            temp=temp.next;
        }
        while (head2!=null){
            temp.next = new SinglyLinkedListNode(head2.data);
            head2=head2.next;
            temp=temp.next;
        }
        return res;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(1);
        n.next = new SinglyLinkedListNode(4);
        n.next.next = new SinglyLinkedListNode(7);

        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        n2.next = new SinglyLinkedListNode(4);
        n2.next.next = new SinglyLinkedListNode(5);
        System.out.println(mergeLists(n,n2));
    }
}
