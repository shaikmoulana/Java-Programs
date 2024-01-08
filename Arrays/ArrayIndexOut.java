package Arrays;
import java.util.Scanner;

public class ArrayIndexOut {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length-1;i++) {
			a[i]=s.nextInt();
		}
		int c=0;
		for(int j=0;j<a.length-1;j++) {
			for(int k=0;k<a.length-1;k++) {
				if(a[j]==a[k]) {
					c++;
				}
			}
			if(c==1) {
				System.out.println(a[j]);
			}
		}
		
		
//		for(int i=0;i<=a.length;i++) {
//	        System.out.println(a[i]);
//			}
		
	}
}