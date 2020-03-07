package asafov.com;

public class Reverseadoublylinkedlist {
    private static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int data) {
            this.data = data;
        }


    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head==null) return null;
        DoublyLinkedListNode node = head;
        DoublyLinkedListNode lNode = head;
        int j = 0;
        while (lNode.next!=null){
            j++;
            lNode=lNode.next;
        }
        int i=0;
        while (i<j){
            i++;
            j--;
            switchD(node,lNode);
            lNode= lNode.prev;
            node=node.next;
        }

        return head;
    }
    private static void switchD(DoublyLinkedListNode one,DoublyLinkedListNode two){
        int t = one.data;
        one.data = two.data;
        two.data = t;
    }
    public static void main(String[] args) {
        DoublyLinkedListNode n = new DoublyLinkedListNode(1);
        n.next = new DoublyLinkedListNode(2);
        n.next.prev = n;
        n.next.next = new DoublyLinkedListNode(3);
        n.next.next.prev = n.next;
        n.next.next.next = new DoublyLinkedListNode(4);
        n.next.next.next.prev = n.next.next;
        DoublyLinkedListNode d = reverse(n);
        while (d!=null){
            System.out.println(d.data);
            d=d.next;
        }
    }
}
