package Revision;
import java.util.*;
public class String1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	char c1[]=s1.toCharArray();
	String s2=s.nextLine();
	char c2[]=s2.toCharArray();
	for(int i=0;i<c1.length;i++) {
		for(int j=i+1;j<c1.length;j++) {
			if(c1[i]==c1[j]) {
				c1[j]='#';
			}
		}
	}
	for(int i=0;i<c2.length;i++) {
		for(int j=i+1;j<c2.length;j++) {
			if(c2[i]==c2[j]) {
				c2[j]='#';
			}
		}
	}
	
	for(int i=0;i<c1.length;i++) {
		for(int j=0;j<c2.length;j++) {
			if((c1[i]==c2[j])&&(c1[i]!='#')) {
				System.out.print(c1[i]);
			}
		}
	}
	
	}

}
