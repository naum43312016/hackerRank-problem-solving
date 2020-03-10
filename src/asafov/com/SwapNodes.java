package asafov.com;

import java.util.*;

public class SwapNodes {
/*
Swap operation:

We define depth of a node as follows:

The root node is at depth 1.
If the depth of the parent node is d, then the depth of current node will be d+1.
Given a tree and an integer, k, in one operation, we need to swap the subtrees of all the nodes at each depth h, where h ∈ [k, 2k, 3k,...]. In other words, if h is a multiple of k, swap the left and right subtrees of that level.

You are given a tree of n nodes where nodes are indexed from [1..n] and it is rooted at 1. You have to perform t swap operations on it, and after each swap operation print the in-order traversal of the current state of the tree.

Function Description

Complete the swapNodes function in the editor below. It should return a two-dimensional array where each element is an array of integers representing the node indices of an in-order traversal after a swap operation.

swapNodes has the following parameter(s):
- indexes: an array of integers representing index values of each , beginning with , the first element, as the root.
- queries: an array of integers, each representing a  value.

Input Format
The first line contains n, number of nodes in the tree.

Each of the next n lines contains two integers, a b, where a is the index of left child, and b is the index of right child of ith node.

Note: -1 is used to represent a null node.

The next line contains an integer, t, the size of .
Each of the next t lines contains an integer , each being a value .

Output Format
For each k, perform the swap operation and store the indices of your in-order traversal to your result array. After all swap operations have been performed, return your result array for printing.

[2, 3]
[-1, -1]
[-1, -1]
Inorder (Left, Root, Right)
root always = 1
 */
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

    private static int in = 0;
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        if (indexes==null) return null;
        int size = 1;
        Node root = new Node(1);
        Node cur = root;
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(cur);
        int i =0;
        while (i<indexes.length){
            cur = nodes.poll();
            int leftData = indexes[i][0];
            int rightData = indexes[i][1];
            if (leftData!=-1) size++;
            if (rightData!=-1) size++;
            cur.left = (leftData==-1)? null: new Node(leftData);
            cur.right = (rightData==-1)? null: new Node(rightData);
            if (cur.left != null && cur.left.data!= -1)
                nodes.offer(cur.left);
            if (cur.right != null && cur.right.data!=-1)
                nodes.offer(cur.right);
            i++;
        }

        int[][] res = new int[queries.length][size];
        for (int j=0;j<res.length;j++){
            Set<Integer> set = new HashSet<>();
            int k = j;
            while (k<res.length){
                if (!set.contains(queries[k])) {
                    swap(root, 1, queries[k]);
                }
                set.add(queries[k]);
                k++;
            }

            in=0;
            fillArray(root,res[j]);
        }

        return res;
    }

    private static void swap(Node root,int l, int q) {
        if (root==null) return;

        swap(root.left,l+1,q);
        if (l%q==0){
            Node n = root.left;
            root.left = root.right;
            root.right = n;
        }
        swap(root.right,l+1,q);
    }


    private static void fillArray(Node n,int[] a){
        if (n==null) return;
        fillArray(n.left,a);
        a[in++] = n.data;
        fillArray(n.right,a);
    }


    public static void main(String[] args) {
        //int[][] indexes = {{2,3},{-1,-1},{-1,-1}};
        int[][] indexes = {{2,3},{4,-1},{5,-1},
                {6,-1},{7,8},{-1,9},{-1,-1},{10,11},{-1,-1},{-1,-1},{-1,-1}};
        //int[] q = {1,1};
        int[] q = {2,4};
        int[][] res = swapNodes(indexes,q);
        for (int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }
    }
}

