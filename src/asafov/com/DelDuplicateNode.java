package asafov.com;

public class DelDuplicateNode {
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
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        while (node!=null && node.next!=null){
            SinglyLinkedListNode t = node.next;
            while (t!=null && node.data==t.data){
                t=t.next;
            }
            node.next = t;
            node=node.next;
        }
        return head;
    }
    public static void main(String[] args) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(1);
        n.next = new SinglyLinkedListNode(2);
        n.next.next = new SinglyLinkedListNode(2);
        n.next.next.next = new SinglyLinkedListNode(3);
        n.next.next.next.next = new SinglyLinkedListNode(4);
        System.out.println(removeDuplicates(n));
    }

}
