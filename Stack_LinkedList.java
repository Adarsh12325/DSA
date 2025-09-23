class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Stack_LinkedList{
    Node top;
    public Stack_LinkedList(){
        this.top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next=top;
            top = newNode;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }
    public int peek(){
        return top.data;
    }
    public void display(){
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Stack_LinkedList s  = new Stack_LinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        s.display();
    }
}
