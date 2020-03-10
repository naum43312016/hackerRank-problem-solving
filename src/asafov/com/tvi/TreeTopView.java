package asafov.com.tvi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TreeTopView {


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
    static class QueueNode{
        Node node;
        int level;
        public QueueNode(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }


    public static void topView(Node root) {
        //took a queue - similar to BFS approach
        Queue<QueueNode> queue = new LinkedList<QueueNode>();

        //Taking a TreeMap<first, second>
        //first - stores the level of the node
        //second - stores the node.data
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        //why TreeMap? Because I want the nodes to be sorted from leftmost to rightmost

        //start (since root, level = 0)
        queue.add(new QueueNode(root, 0));

        while(!queue.isEmpty()){
            //remove element from queue
            QueueNode r = queue.poll();
            //if the level of this node has never been reached before -> visible in top view
            if(!map.containsKey(r.level)){
                map.put(r.level, r.node.data);
            }

            //add node's descendants
            //all left child node levels = node.level - 1
            //all right child node levels = node.level + 1
            if(r.node.left != null){
                queue.add(new QueueNode(r.node.left, r.level - 1));
            }
            if(r.node.right != null){
                queue.add(new QueueNode(r.node.right, r.level + 1));
            }
        }
        //since already sorted (cuz TreeMap), print from left to right
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {


        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        n.left.right.right = new Node(6);
        n.left.right.right.right = new Node(7);
        topView(n);
    }
}
