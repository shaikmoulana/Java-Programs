import java.util.*;
public class Num_amicable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=0;
		int sum1=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum=sum+i;
			}
		}
		for(int i=1;i<b;i++) {
			if(b%i==0) {
				sum1=sum1+i;
			}
		}
		if(sum==b && sum1==a) {
			System.out.println(a+","+b+" are amicable numbers");
		}
		else {
			System.out.println(a+","+b+" are not amicable numbers");
		}
	}

}
