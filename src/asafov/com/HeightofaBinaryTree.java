package asafov.com;

public class HeightofaBinaryTree {

    private  static class Node {
        int data;
        Node left;
        Node right;
    }
    private static int h=0;
    public static int height(Node root) {
        // Write your code here.
        Rec(root,0);
        return h;
    }
    private static void Rec(Node n,int i){
        if (n==null) return;
        h = Math.max(h,i);
        Rec(n.left,i+1);
        Rec(n.right,i+1);
    }
    public static void main(String[] args) {

    }
}
