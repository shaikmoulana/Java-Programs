import java.util.*;
public class Num_happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+(r*r);
			n=n/10;
			if(n==0 && sum>9) {
				n=sum;
				sum=0;
			}
		}
		if(sum==1) {
			System.out.println("Happy number");
		}
		else {
			System.out.println("not happy");
		}
	}

}
