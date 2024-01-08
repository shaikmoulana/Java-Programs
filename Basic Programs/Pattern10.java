import java.util.*;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
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
