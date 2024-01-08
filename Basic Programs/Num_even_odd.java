import java.util.Scanner;

public class Num_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum1=0,sum2=0;
		while(n>0) {
			int r=n%10;
			if(r%2==0) {
				sum1=sum1+r;	
				System.out.println(r+" =even");
			}
			else {
				System.out.println(r+" =odd");
				sum2=sum2+r;
			}
			
			n=n/10;
			
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
