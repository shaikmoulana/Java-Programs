import java.util.Arrays;
import java.util.Scanner;

public class Array_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = 0;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int b[]=new int[n];
		int x=0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[x]=a[i];
				x++;
//				System.out.println(x+"hii");
			}
		
		}
		b[x]=a[n-1];
		System.out.println(Arrays.toString(b));
		int c[]=new int[x+1];
		for(int i=0;i<=x;i++) {
			c[i]=b[i];
		}
		System.out.println(Arrays.toString(c));
		System.out.println(c[c.length-1]+" maximum");
		System.out.println(c[c.length-2]+" second max");
		System.out.println(c[0]+" minimum");
		System.out.println(c[1]+" second minimum");
	}

}
