//-----1/1+ 1/sqrt(2) + 1/sqrt(3) + -------------

import java.util.*;

public class series_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=0.0;
		
		for(int i=1;i<=n;i++) {
			sum=sum+(1/Math.sqrt(i));
		}
		System.out.println(sum);

	}

}
