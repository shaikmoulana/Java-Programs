package Revision;
import java.util.*;
public class String5 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2="";
	char c1[]=s1.toCharArray();
	for(int i=0;i<c1.length;i++) {
		if((c1[i]=='a')|| (c1[i]=='e')|| (c1[i]=='i')||(c1[i]=='u')||(c1[i]=='o')) {
			c1[i]=Character.toUpperCase(c1[i]);
		}
	}
	
	
	}

}
