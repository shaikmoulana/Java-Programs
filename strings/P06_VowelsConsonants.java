package strings;
import java.util.*;
public class P06_VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(		(c[i]=='a') || (c[i]=='e') ||
					(c[i]=='i') || (c[i]=='o') ||
					(c[i]=='u')
				) {
				c[i]=Character.toUpperCase(c[i]);
			}
			else {
				c[i]=Character.toLowerCase(c[i]);
			}
		}
		System.out.println(c);
	}

}
