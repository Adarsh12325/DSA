import java.util.*;
class Stack{
    int top,cap;
    int[] a;

    public Stack(int cap){
        this.cap = cap;
        top = -1;
        a = new int[cap];
    }

    public boolean push(int x){
        if(top>=cap-1){
            System.out.println("Stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }
    public int pop(){
        if(top<0){
            System.out.println("Stack underflow");
        }
        return a[top--];
    }
    public int peek(){
        if(top<0){
            System.out.println("empty");
        }
        return a[top];
    }
    public boolean isEmpty(){
        return top<0;
    }
}
public class ArrayStack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Stack s = new Stack(n);
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            s.push(x);
        }
        System.out.println(s.pop()+" popped from stack");
        System.out.println("elements present in stack: ");
        while(!s.isEmpty()){
            System.out.println(s.peek()+"  ");
            s.pop();
        }
    }
}
