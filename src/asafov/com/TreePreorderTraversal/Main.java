package asafov.com.TreePreorderTraversal;

public class Main {



    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void preOrder(Node root) {
        traverse(root);
    }

    private static void traverse(Node node){
        if (node==null) return;
        System.out.print(node.data + " ");
        traverse(node.left);
        traverse(node.right);
    }
    public static void main(String[] args) {

    }
}

