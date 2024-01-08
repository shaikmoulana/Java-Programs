import java.util.Scanner;

public class Num_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		while(n>0) {
			int r=n%10;
			int c=0;
			
			for(int i=1;i<r;i++) {
				if(r%i==0) {
					c++;
				}
			}//for
				if(c==1) {
					count++;
				}
	
			
		n=n/10;	
		}//while
		System.out.println(count);
	}

}
