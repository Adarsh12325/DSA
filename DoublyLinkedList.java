import java.util.*;
class Nodes{
    int data;
    Nodes next;
    Nodes prev;
    Nodes(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
    public class DoublyLinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,data;
        n = sc.nextInt();
        Nodes head = null;
        for(int i=0;i<n;i++){
            data = sc.nextInt();
            Nodes newNode = new Nodes(data);
            if(head==null){
             head=newNode;
            }else{
               Nodes tail = head;
               while(tail.next!=null){
                tail=tail.next;
               }  
               tail.next=newNode;
               newNode.prev=tail;
            }
        }
            Nodes temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        sc.close();
    }
}
