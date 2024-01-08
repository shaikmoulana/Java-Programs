
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int l=i;l>=1;l--) {
				System.out.print(l);
			}
			System.out.println();
			
		}
	
	}

}
