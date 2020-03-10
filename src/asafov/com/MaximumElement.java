package asafov.com;

import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Stack<StackNode> stack = new Stack<>();
        int j = scanner.nextInt();
        int i = 0;
        while(i<j){
            int q = scanner.nextInt();
            if(q==1){//push elem
                int val = scanner.nextInt();
                if (stack.isEmpty()){
                    stack.push(new StackNode(val,val));
                }else{
                    int max = Math.max(val,stack.peek().curMax);
                    stack.push(new StackNode(val,max));
                }

            }else if(q==2) { //delete elem
                stack.pop();

            }else if(q==3){//print maximum elem
                System.out.println(stack.peek().curMax);
            }
            i++;
        }

        scanner.close();
    }

    private static class StackNode{
        int val;
        int curMax;

        public StackNode(int val, int curMax) {
            this.val = val;
            this.curMax = curMax;
        }
    }

}
