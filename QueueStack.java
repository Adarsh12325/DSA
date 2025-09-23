import java.util.*;
public class QueueStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void add(int data){
        s1.push(data);
    }
    public int remove(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public static void main(String[] args){
        QueueStack q = new QueueStack();
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println(q.peek());
    }
}
