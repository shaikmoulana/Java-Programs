package strings;
import java.util.*;
public class compareStrings2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	int c=0;
	if(s1.length()==s2.length()) {
		for(int i=1;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}
	else {
		System.out.println("not equal");
	}
	
}
}
