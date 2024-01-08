import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k>1;k--) {
				System.out.print(k);
			}
			for(int l=1;l<=i;l++) {
				System.out.print(l);
			}
			System.out.println();
			
		}
	
	}

}
