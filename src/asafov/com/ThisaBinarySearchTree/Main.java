package asafov.com.ThisaBinarySearchTree;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static boolean checkBST(Node root) {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    static boolean check(Node n, int min, int max){
        if(n==null)
            return true;
        if(n.data <= min || n.data >= max)
            return false;
        return check(n.left, min, n.data)
                && check(n.right, n.data, max);
    }


    public static void main(String[] args) {
        Node n = new Node(4);
        n.left = new Node(2);
        n.right = new Node(6);
        n.left.left = new Node(1);
        n.left.right = new Node(3);
        n.right.left = new Node(5);
        n.right.right = new Node(7);
        System.out.println(checkBST(n));
    }
}
