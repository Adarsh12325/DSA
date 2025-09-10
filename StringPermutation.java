import java.util.*;
public class StringPermutation{
    static void permutation(String s,String e){
        if(s.length()==0){
            System.out.println(e);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String Str = s.substring(0,i)+s.substring(i+1);
            permutation(Str,e+ch);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        permutation(s,"");
    }
}