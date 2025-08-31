import java.util.Scanner;
public class Largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        int Largest=(x>y)?(x>z?x:z):(y>z?y:z);
        System.out.println("The largest number is:"+Largest);
    }
}
