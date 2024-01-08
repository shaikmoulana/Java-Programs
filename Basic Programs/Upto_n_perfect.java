import java.util.Scanner;

public class Upto_n_perfect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int temp=n;
		for(int i=1;i<=n;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
			if(i%j==0) {
//				System.out.print(i+" ");
				sum=sum+j;
			}		
		}
			if(i==sum) {
				System.out.print(i+" ");
			}
	}
	}

}
