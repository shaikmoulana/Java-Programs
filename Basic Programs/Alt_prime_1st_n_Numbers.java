import java.util.Scanner;

public class Alt_prime_1st_n_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=2;count<2*n;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==0) {
//				System.out.print(i+" ");
				count++;
				if(count%2==0) {
					System.out.print(i+" ");
				}
			}
		}
	}

}
