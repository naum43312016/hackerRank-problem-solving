package asafov.com;

public class BinarySearchTreeInsertion {

    private static class Node{
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

    public static Node insert(Node root,int data) {
        if (root==null){
            return new Node(data);
        }
        insertData(root,data);
        return root;
    }

    private static void insertData(Node root, int data) {
        if (root==null) return;
        if (data<=root.data){
            //left
            if (root.left==null){
                root.left=new Node(data);
                return;
            }else {
                insertData(root.left,data);
            }
        }else{
            //right
            if (root.right==null){
                root.right=new Node(data);
                return;
            }else {
                insertData(root.right,data);
            }
        }
    }

    public static void main(String[] args) {
        Node n = new Node(4);
        n.left = new Node(2);
        n.right = new Node(7);
        n.left.left = new Node(1);
        n.left.right = new Node(3);
        System.out.println(insert(n,6));
    }
}
