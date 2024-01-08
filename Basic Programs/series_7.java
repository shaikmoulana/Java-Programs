//-----1/1 - 1/2^2 + 1/3^3 - 1/4^4 +  -------------

import java.util.Scanner;

public class series_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=0.0;
		double sum1=0.0;
		double sum2=0.0;
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
			sum1=sum1+(1/Math.pow(i,i));
			}
			else {
				sum2=sum2+(1/Math.pow(i,i));
			}
			sum=sum2-sum1;
		}
		System.out.println(sum);
	}

}
