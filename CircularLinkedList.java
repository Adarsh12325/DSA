import java.util.*;
class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
        this.next=null;
    }
}

public class CircularLinkedList {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,data;
    n = sc.nextInt();
    Node3 head = null;
    Node3 tail = null;
    for(int i=0;i<n;i++){
        data = sc.nextInt();
        Node3 newNode = new Node3(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next = head;
        }
    } 
    if(head!=null){
        Node3 temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);
    }else{
        System.out.println("empty linked list");
    }
    System.out.println();
    sc.close();
    }
    
}

