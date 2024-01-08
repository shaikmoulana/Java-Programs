package Revision;
import java.util.*;
public class Strin6_unique {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	String s3="";
	String s4="";
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	
	int count1=0;
	for(int i=0;i<c1.length;i++) {
		for(int j=0;j<c1.length;j++) {
			if(c1[i]==c1[j]) {
				count1++;
			}
			if(count1==1) {
				s3=s3+Character.toString(c1[i]);
			}
		}
	}
//	int count2=0;
//	for(int i=0;i<c2.length;i++) {
//		for(int j=0;j<c2.length;j++) {
//			if(c2[i]==c2[j]) {
//				count2++;
//			}
//			if(count2==1) {
//				s4=s4+Character.toString(c1[i]);
//			}
//		}
//	}	
//	System.out.println(s3+s4);
	}}
