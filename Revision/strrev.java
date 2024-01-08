package Revision;
import java.util.*;
public class strrev {
public static void main(String[] args) {
	
	String s1=new String("moulana welcome");
	
//	s1.reverse();
//	System.out.println(s1);
	
	char c[]=s1.toCharArray();	
	for(int i=c.length-1;i>=0;i--) {
		System.out.print(c[i]);
	}
	
}
}
