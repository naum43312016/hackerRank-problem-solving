package asafov.com;

import java.util.HashSet;
import java.util.Set;

public class FindMergeNode {
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


    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Set<SinglyLinkedListNode> set = new HashSet<>();
        while (head1!=null){
            set.add(head1);
            head1=head1.next;
        }
        while (head2!=null){
            if (set.contains(head2)) return head2.data;
            head2=head2.next;
        }
        return 0;
    }


    public static void main(String[] args) {

    }
}
