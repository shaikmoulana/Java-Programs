package Revision;
import java.util.*;

public class String_prgms {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		String s1=s.nextLine();
//		char c=s.next().charAt(0);
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(s1.length());
	}

}
