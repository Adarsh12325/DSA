import java.util.Scanner;
public class Array2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        System.out.println("enter element: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Required Array: ");
        for(int[] row:arr){
            for(int val:row){
                System.out.println(val+" ");
            }
            System.out.println();
        }
    }
}
