package GFG;
import java.util.*;
public class ImplementStackAndQueueUsingDeque {
    public static void main(String[] args) {
        Stack stk = new Stack();
        for(int i = 0 ; i < 10 ; i ++) {
            stk.push(i);
        }
        System.out.println(stk.size());
        for(;stk.size() > 0 ;) {
            System.out.print(stk.pop() + " ");
        }
        System.out.println();
        Queue queue = new Queue();
        for(int i = 0 ; i < 10 ; i ++) {
            queue.push(i);
        }
        System.out.println(queue.size());
        for(;queue.size() > 0 ;) {
            System.out.print(queue.pop() + " ");
        }
    }
}
class Stack{
    Deque<Integer> deque = new ArrayDeque<>();
    public Stack(){
        System.out.println("creating custom stack");
    }
    public void push(int a){
        deque.addFirst(a);
    }
    public int pop(){
        return deque.removeFirst();
    }
    public int peek(){
        return deque.peekFirst();
    }
    public int size(){
        return deque.size();
    }
}
class Queue{
    Deque<Integer> deque = new ArrayDeque<>();
    public Queue(){
        System.out.println("creating custom queue");
    }
    public void push(int a){
        deque.addLast(a);
    }
    public int pop(){
        return deque.removeFirst();
    }
    public int peek(){
        return deque.peekFirst();
    }
    public int size(){
        return deque.size();
    }
}
