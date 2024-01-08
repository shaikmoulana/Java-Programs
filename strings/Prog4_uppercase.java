package strings;
import java.util.*;
public class Prog4_uppercase {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2="";
	s2=s2+Character.toUpperCase(s1.charAt(0));
	for(int i=1;i<s1.length();i++) {
			if(s1.charAt(i-1)==' ') {
				s2=s2+Character.toUpperCase(s1.charAt(i));
			}
			else {
				s2=s2+s1.charAt(i);
			}
	}
	System.out.println(s2);
}
}