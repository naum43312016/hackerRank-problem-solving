package asafov.com;

public class InorderTraversal {


    private static class Node {
        int data;
        Node left;
        Node right;
    }



    public static void inOrder(Node root) {
        traverse(root);
    }

    private static void traverse(Node node){
        if (node==null) return;
        traverse(node.left);
        System.out.print(node.data + " ");
        traverse(node.right);
    }
    public static void main(String[] args) {

    }
}
