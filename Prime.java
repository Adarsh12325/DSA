import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int x = sc.nextInt();
		for(int i=2;i<=Math.sqrt(x);i++){
			if(x%i==0){
				flag = true;
			}	
		}
		if(flag){
			System.out.println("Not Prime");
		}else{
			System.out.println("Prime");
		}
	}
}