import java.util.*;
class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
        next = null;
    }
}
public class LinkedList{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n, value;
    n = sc.nextInt();
    Node Head = null;
    Node Tail = null;
    for(int i=0;i<n;i++){
        System.out.print("Enter data no:"+(i+1)+": ");
        value = sc.nextInt();
        Node newNode = new Node(value);
        if(Head == null){
            Head = newNode;
            Tail = newNode;
        }else{
            Tail.next = newNode;
            Tail = newNode;
        }
    }
    Node Temp = Head;
    while(Temp != null){
        System.out.print(Temp.data+" ");
        Temp=Temp.next;
    }
}
}