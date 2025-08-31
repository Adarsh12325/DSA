import java.util.Scanner;
public class Mul2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] A={{1,2},{3,4}};
        int[][] B={{5,6},{7,8}};
        int[][] result = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    result[i][j]=A[i][k]*B[k][j];
                }
            }
        }
        for(int[] row:result){
            for(int val:row){
                System.out.println(val+"");
            }
            System.out.println();
        }
    }
}
