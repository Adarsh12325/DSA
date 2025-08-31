import java.util.Scanner;
public class Prime2 {
    public static boolean isPrime(int x){
        if(x<=0){
            return false;
        }

        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        if(isPrime(x)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
