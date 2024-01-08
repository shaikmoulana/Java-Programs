import java.util.Scanner;

public class Pattern03 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		
		for(int i=1;i<=r;i++) {
			for(int j=r;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
