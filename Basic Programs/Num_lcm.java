import java.util.*;
public class Num_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int m=a>b?a:b;
		int l=0;
		for(int i=m;i<=a*b;i++) {
			if((i%a==0)&&(i%b==0)) {
				System.out.println(i);
				break;

			}
		}
	}

}
