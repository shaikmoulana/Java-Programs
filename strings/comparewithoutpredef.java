package strings;
import java.util.*;
public class comparewithoutpredef {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	int flag=1;
	if(s1.length()==s2.length()) {
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				flag=0;
				break;
			}
		}		
	}
	else {
		flag=0;
	}
	if(flag==1) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
}
}
