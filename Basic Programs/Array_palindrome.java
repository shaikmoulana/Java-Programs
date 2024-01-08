import java.util.*;
public class Array_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int p=0;
			int temp=a[i];
			while(a[i]>0) {
				int r=a[i]%10;
				p=p*10+r;
				a[i]=a[i]/10;
			}
			if(temp==p) {
				System.out.println(temp+" Palindrome");
			}
			else {
				System.out.println(temp+" not palindrome");
			}
			
		}
	}

}
