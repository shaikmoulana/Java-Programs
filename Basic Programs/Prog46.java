
public class Prog46 {

	public static void main(String[] args) {
		int k=0;
		int temp;
		for(int j=1;j<=100;j++) {
		int c=0;
	
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				System.out.println(i);
				c++;
			}
		}
		if(c>k) {
			k=c;
			temp=j;
		}
	}
	System.out.println(k);
	
	}

}
