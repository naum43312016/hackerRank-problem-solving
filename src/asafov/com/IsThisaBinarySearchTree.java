package asafov.com;

public class IsThisaBinarySearchTree {


    private static class Node {
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

    private static boolean checkBST(Node root) {
        if (root==null) return true;
        if (!checkL(root.left,root.data)){
            return false;
        }
        if (!checkR(root.right,root.data)){
            return false;
        }
        return checkBST(root.left) && checkBST(root.right);
    }
    private static boolean checkL(Node n,int val){
        if (n==null) return true;
        if (n.data>=val) return false;
        return checkL(n.left,val) && checkL(n.right,val);
    }
    private static boolean checkR(Node n,int val){
        if (n==null) return true;
        if (n.data<=val) return false;
        return checkR(n.left,val) && checkR(n.right,val);
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(4);
        n.left.left = new Node(3);
        n.left.right = new Node(5);
        n.right.left = new Node(6);
        n.right.right = new Node(7);
        //1 2 4 3 5 6 7
        System.out.println(checkBST(n));
    }
}
