import java.util.Scanner;

public class Num_alt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0; 
		while(n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/100;
		}
			
		while(sum>0) {
			System.out.print(sum%10+" ");
			sum/=10;
		}
				
	

}}
