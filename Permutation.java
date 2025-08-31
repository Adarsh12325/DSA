import java.util.*;
public class Permutation {
    static void Base(String s,String p){
        if(s.length() == 0){
            System.out.println(p);
            return;
        }
        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            String r = s.substring(0, i)+s.substring(i+1);
            Base(r,p+ch);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Permutation.Base(s, " ");
    }
}
