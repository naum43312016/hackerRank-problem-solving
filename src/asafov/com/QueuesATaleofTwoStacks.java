package asafov.com;

import java.util.Stack;


public class QueuesATaleofTwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(12);
        q.enqueue(14);
        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        q.enqueue(71);
        q.enqueue(63);
        System.out.println(q.peek());
    }
}

class MyQueue<T>{

    private Stack<T> stack = new Stack<>();

    public void enqueue(T elem){
        stack.push(elem);
    }

    public void dequeue(){
        stack.remove(0);
    }

    public T peek(){
        return stack.firstElement();
    }
}
