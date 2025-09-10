import java.util.ArrayList;
public class ArrayListStack {
    public static void main(String[] args){
    ArrayList<Integer> a = new ArrayList<>();
    a.add(20);
    a.add(30);
    a.add(40);

    a.remove(a.size()-1);
    while(!a.isEmpty()){
        System.out.println(a.get(a.size()-1)+" ");
        a.remove(a.size()-1);
    }
    }
}
