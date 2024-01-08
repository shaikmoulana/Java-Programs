import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		
		for(int i=1;i<=r;i++) {
			for(int j=r;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println("");
	}
	}

}
