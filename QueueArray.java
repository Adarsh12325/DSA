public class QueueArray
{
	int s;
	int[] arr;
	int front,rear;
	QueueArray(int s){
	    this.s=s;
	    arr = new int[s];
	    front = -1;
	    rear = -1;
	}
	public boolean isEmpty(){
	    return front ==-1;
	}
	public boolean isFull(){
	    return (rear+1)%s == front;
	}
	public void add(int d){
	    if(isFull()){
	        System.out.println("queue overflow");
	        return;
	    }
	    if(front == -1) front = 0;
	    rear = (rear+1)%s;
	    arr[rear] = d;
	}
	public int remove(){
	    if(isEmpty()){
	        System.out.println("queue underflow");
	        return -1;
	    }
	    int v = arr[front];
	    if(front == rear){
	        front = -1;
	        rear = -1;
	    }else{
	    front = (front+1)%s;
	    }
	    return v;
	}
	public int peek(){
	    if(isEmpty()){
	        System.out.println("queue underflow");
	        return -1;
	    }
	    return arr[front];
	}
	public void display(){
	    if(isEmpty()){
	        System.out.println("queue underflow");
	    }
	    int i = front;
	    while(true){
	        System.out.print(arr[i]+" ");
	        if(i == rear) break;
	        i = (i+1)%s;
	    }
	    System.out.println();
	}
	public static void main(String[] args){
	    QueueArray q=new QueueArray(3);
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    q.display();
	    //System.out.println(q.peek());
	    q.remove();
	    q.display();
	}
}