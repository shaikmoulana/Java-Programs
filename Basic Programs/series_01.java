//-----1/1+ 1/2 + 1/3 + 1/4-------------


import java.util.Scanner;

public class series_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float sum=0.0f;
		
		for(int i=1;i<=n;i++) {
			sum=sum+(1.0f/i);
		}
		System.out.println(sum);
	}

}
