//-----1/1+ 1/2^1 + 1/2^2 + 1/2^3-------------


import java.util.*;

public class series_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=0.0;
		
		for(int i=0;i<=n;i++) {
			sum=sum+(1/Math.pow(2,i));
		}
		System.out.println(sum);
	}

}
