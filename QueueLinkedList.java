class Node9{
    int data;
    Node9 next;
    Node9(int data){
        this.data = data;
        this.next = null;
    }
}
public class QueueLinkedList {
    Node9 front,rear;
    QueueLinkedList(){
        this.front = null;
        this.rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void add(int data){
        Node9 newNode =  new Node9(data);
        if(rear == null){
            front = newNode;
            rear = newNode;
            return;
        }
            rear.next = newNode;
            rear = newNode;
         
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return val;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        return front.data;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue underflow");
        }
        Node9 temp = front;
        while(temp != null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        QueueLinkedList q = new QueueLinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
    }
}