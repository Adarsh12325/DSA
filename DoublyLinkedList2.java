import java.util.*;
class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int data){
        this.data=data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Node2 head = null;
    Node2 tail = null;
    int n,data;
    n = sc.nextInt();
    for(int i=0;i<n;i++){
        data = sc.nextInt();
        Node2 newNode = new Node2(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }}
        Node2 temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<=>");
            temp=temp.next;
        }
        System.out.println();
        temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"<=>");
            temp=temp.prev;
        }
        System.out.println();
        sc.close();
    }
}

