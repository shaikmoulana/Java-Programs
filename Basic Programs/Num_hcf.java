import java.util.Scanner;

public class Num_hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int m=(a<b)?a:b;
	int h=0;
	for(int i=1;i<=m;i++) {
		if((a%i==0)&&(b%i==0)) {
			h=i;	
		}
	}
	
	System.out.println(h);
	}

}
