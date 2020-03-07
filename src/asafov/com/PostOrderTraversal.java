package asafov.com;

public class PostOrderTraversal {


    private static class Node {
        int data;
        Node left;
        Node right;
    }



    public static void postOrder(Node root) {
        traverse(root);
    }

    private static void traverse(Node node){
        if (node==null) return;
        traverse(node.left);
        traverse(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {

    }
}
