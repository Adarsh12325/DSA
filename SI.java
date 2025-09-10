import java.util.Scanner;
public class SI {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        Float SI = (P*R*T)/100F;
        System.out.println("SI = "+SI);
    }
}
