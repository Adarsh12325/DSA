import java.util.*;
class Node11{
    int data;
    Node11 left;
    Node11 right;
    Node11(int data){
        this.data = data;
        this.left = null;
        this.right = null;      
    }
}
public class BinaryTree02 {
    public static void preorder(Node11 root){
        if(root == null) return;
        System.out.print(root.data+" ");;
        preorder(root.left);
        preorder(root.right);
    } 
    public static void inorder(Node11 root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node11 root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }   
    public static void levelorder(Node11 root){
        if(root == null) return;
        Queue<Node11> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node11 c = q.remove();
            System.out.print(c.data+" ");
            if(c.left!=null) q.add(c.left);
            if(c.right!=null) q.add(c.right);
        }
    }
    public static void main(String args[]){
        Node11 Parent = new Node11(1);
        Parent.left = new Node11(2);
        Parent.right = new Node11(3);
        Parent.left.left = new Node11(4);
        Parent.left.right = new Node11(5);
        preorder(Parent);
        inorder(Parent);    
        postorder(Parent);
        levelorder(Parent);

    }
}
