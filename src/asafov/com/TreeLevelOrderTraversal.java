package asafov.com;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeLevelOrderTraversal {


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

    private static TreeMap<Integer, List<Integer>> map = new TreeMap<>();

    public static void levelOrder(Node root) {
        traverse(root,0);
        for (Map.Entry<Integer, List<Integer>>
                entry : map.entrySet()){
            System.out.println(entry.getKey());
            List<Integer> list = entry.getValue();
            for (int i : list){
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("___________");
        }
    }

    private static void traverse(Node n,int level){
        if(n==null) return;
        if (map.containsKey(level)){
            List<Integer> list = map.get(level);
            list.add(n.data);
            map.put(level,list);
        }else{
            List<Integer> list = new LinkedList<>();
            list.add(n.data);
            map.put(level,list);
        }
        traverse(n.left,level+1);
        traverse(n.right,level+1);
    }


    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        n.left.right.right = new Node(6);
        n.left.right.right.right = new Node(7);
        levelOrder(n);
    }
}
