package strings;
import java.util.*;
public class Prog10_vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char c[]=s1.toCharArray();
		int v=0,con=0;
		for(int i=0;i<c.length;i++) {
			if( (c[i]>='A' && c[i]<='Z') || (c[i]>='a' && c[i]<='z') ) {
				if( (c[i]=='A')|| (c[i]=='a') ||
					(c[i]=='E')|| (c[i]=='e') ||
					(c[i]=='I')|| (c[i]=='i') ||
					(c[i]=='O')|| (c[i]=='o') ||
					(c[i]=='U')|| (c[i]=='u')
				) {
					v++;
				}
				else {
					con++;
				}
			}

		}
		System.out.println("vowels count "+ v);
		System.out.println("consonants count "+ con);
	}

}
