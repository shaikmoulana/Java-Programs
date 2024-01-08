//-----1/1+ 1/2^2 + 1/2^3 + 1/2^4-------------

import java.util.*;
public class series_4 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=1.0;
		
		for(int i=2;i<=n;i++) {
			sum=sum+(1/Math.pow(2,i));
		}
		System.out.println(sum);
	}

}
