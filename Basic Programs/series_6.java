//-----1/1^0 + 2/2^1 + 3/2^2 + 4/2^3-------------

import java.util.Scanner;

public class series_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=1.0;
		
		for(int i=2;i<=n;i++) {
			sum=sum+(i/Math.pow(2,i-1));
		}
		System.out.println(sum);
	}

}
