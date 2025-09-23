public class DecimalToHexa {
    public static void main(String[] args) {
        int n = -10;
        int x = Math.abs(n);
        String s = "";
        while(x!=0){
            s=x%2+s;
            x=x/2;
        }
        System.out.println(s);
        int y = s.length();
        for(int i=0;i<(32-y);i++){
            s=0+s;
        }
        System.out.println(s);
    }
}
