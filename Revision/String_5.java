package Revision;
import java.util.*;
public class String_5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2="";
	char c1[]=s1.toCharArray();
	for(int i=0;i<c1.length;i++) {
		s2=c1[i]+s2;
	}
	if(s1.equals(s2)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	
}
}
