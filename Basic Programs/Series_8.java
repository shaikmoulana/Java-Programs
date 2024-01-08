import java.util.*;
public class Series_8 {
	static int factorial(int i) {
		int fact=1;
		for(int j=1;j<=i;j++) {
			fact=fact*j;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		double sum=1.0;
		for(int i=1;i<=n;i++) {
			sum=sum+(double)(Math.pow(2, i)/factorial(i));
		}
		System.out.println(sum);
	}

}
