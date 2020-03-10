package asafov.com.TreeHuffmanDecoding;

public class Main {


	private static class Node{
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
   }


    private static void decode(String s, Node root) {

        StringBuilder sb = new StringBuilder();
        Node c = root;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i) == '1' ? c.right : c.left;
            if (c.left == null && c.right == null) {
                sb.append(c.data);
                c = root;
            }
        }
        System.out.print(sb);

    }
    public static void main(String[] args) {

    }
}
