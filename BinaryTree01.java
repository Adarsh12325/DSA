import java.util.*;
class node10{
    int data;
    node10 left;
    node10 right;
    node10(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,data;
        n = sc.nextInt();
        node10 root = null;
        for(int i=0;i<n;i++){
            data = sc.nextInt();
            node10 newNode = new node10(data);
            if(root==null){
                root=newNode;
            }else{
                Queue<node10> q = new LinkedList<>();
                q.add(root);
                while(!q.isEmpty()){
                    node10 temp = q.poll();
                    if(temp.left==null){
                        temp.left=newNode;
                        break;
                    }else{
                        q.add(temp.left);
                    }
                    if(temp.right==null){
                        temp.right=newNode;
                        break;
                    }else{
                        q.add(temp.right);
                    }
                }
            }
        }
    }
}
