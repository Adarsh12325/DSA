import java.util.*;
public class Pattern {
    public static void main(String[] args){
        String s="ADITYA";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<2*s.length()-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(s.charAt(k)+" ");
            }
            System.out.println();
        }
        for(int i=s.length()-2;i>=0;i--){
            for(int j=0;j<2*s.length()-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(s.charAt(k)+" ");
            }
            System.out.println();
        }
    }
}
