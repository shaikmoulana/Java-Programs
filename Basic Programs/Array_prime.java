import java.util.*;
public class Array_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=2;j<a[i];j++) {
					if(a[i]%j==0) {
						c++;
					}
			}
				if(c==0 && a[i]!=1) {
					System.out.println(a[i]+" prime");
				}
				else {
					System.out.println(a[i]+" not prime");
				}
			}
		}
		
	}

