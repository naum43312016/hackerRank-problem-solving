package asafov.com;

public class BSTLowestCommonAncestor {



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
	private static Node res = null;
    public static Node lca(Node root, int v1, int v2) {
        Rec(root,v1,v2);
        return res;
    }

    private static void Rec(Node n,int v1,int v2){
        if (n==null) return;
        if (Check(n,v1) && Check(n,v2)){
            res = n;
        }
        Rec(n.left,v1,v2);
        Rec(n.right,v1,v2);
    }
    private static boolean Check(Node root,int val){
        while (root!=null){

            if (root.data == val){

                return true;
            }
            if (val<root.data){
                root = root.left;
            }else{
                root = root.right;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Node n = new Node(2);
        n.left = new Node(1);
        n.right = new Node(3);
        n.right.left = new Node(4);
        n.right.right = new Node(5);
        n.right.right.right= new Node(6);
        System.out.println(lca(n,4,6));
    }
}
