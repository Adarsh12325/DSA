import java.util.*;
class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListUD01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,data;
        System.out.println("Enter size:");
        n = sc.nextInt();
        Node4 head = new Node4(0);
        Node4 temp = head;
        for(int i=0;i<n;i++){
            System.out.print("Enter element"+(i+1)+" ");
            data = sc.nextInt();
            Node4 newNode = new Node4(data);
            temp.next = newNode;
            temp = newNode;
        }
        head = head.next;
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Enter value to insert: ");
        int v = sc.nextInt();
        System.out.println("Enter position: ");
        int pos = sc.nextInt();
        temp=head;
        int count = 1;
        while(count != pos - 1){
            temp = temp.next;
            count++;
        }
        Node4 newNode = new Node4(v);
        Node4 thirdNode = temp.next;
        temp.next=newNode;
        newNode.next=thirdNode;
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Enter position to delete");
        int p = sc.nextInt();
        int c = 0;
        temp=head;
        while(c!=pos-1){
            temp=temp.next;
            c++;
        }
        temp.next=temp.next.next;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        sc.close();
    }
}
