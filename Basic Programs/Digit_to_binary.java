import java.util.*;
public class Digit_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rev=1;
		while(n>0) {
			int r=n%2;
//			System.out.print(r);
			rev=rev*10+r;
			n=n/2;
		}
//		System.out.println(rev);
		if(rev>0) {
			rev=rev/10;
			System.out.println(rev);
		}


	}

}
