package strings;
import java.util.*;
public class Prog8_az {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if( (c[i]>='A' && c[i]<='Z') || (c[i]>='a' && c[i]<='z') ) {
				System.out.print(c[i]);
			}
		}
	}

}
