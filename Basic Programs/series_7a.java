import java.util.Scanner;

public class series_7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=0.0;
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
			sum=sum-(1/Math.pow(i,i));
			}
			else {
				sum=sum+(1/Math.pow(i,i));
			}
		}
		System.out.println(sum);
	}

}
