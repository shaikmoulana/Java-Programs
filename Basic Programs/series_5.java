//-----1/1+ 1/2^2 + 1/3^3 + 1/4^4-------------

import java.util.Scanner;

public class series_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=1.0;
		
		for(int i=2;i<=n;i++) {
			sum=sum+(1/Math.pow(i,i));
		}
		System.out.println(sum);
	}

}
