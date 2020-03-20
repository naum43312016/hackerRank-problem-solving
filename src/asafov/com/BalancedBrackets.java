package asafov.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BalancedBrackets {

    static String isBalanced(String s) {
        Stack<Character> q = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (isClosed(c)){
                if (q.isEmpty()) return "NO";
                char qC = q.pop();
                int a = ((int)c) - ((int)qC);
                if (a>2) return "NO";
            }else{
                q.push(c);
            }
        }
        if (!q.isEmpty()) return "NO";
        return "YES";
    }

    static boolean isClosed(char c){
        if (c==')' || c=='}' || c==']') return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({}([][]))[]()"));
    }
}
