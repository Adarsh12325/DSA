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
        node10 Parent = new node10(30);
        node10 child1 = new node10(20);
        node10 child2 = new node10(40);
        Parent.left = child1;
        Parent.right = child2;
        System.out.println(Parent.left.data);
    }
}