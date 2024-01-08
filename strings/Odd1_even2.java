package strings;
import java.util.*;
public class Odd1_even2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	char[] s2=s1.toCharArray();
	for(int i=0;i<s1.length();i++) {	
		if(s2[i]!=' ') {
			
		if(i%2==0) {
			char c1=s2[i];
			if(c1=='z') System.out.print("a");
			else System.out.print((char)(c1+1));
		}
		else {
			char c2=s2[i];
			if(c2=='y') System.out.print("a");
			else if(c2=='z') System.out.print("b");
			else System.out.print((char)(c2+2));			
		}
	}
		else {
			System.out.print(" ");
		}
	}
	
}
}
