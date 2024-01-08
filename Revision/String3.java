package Revision;
import java.util.*;
import java.io.*;
public class String3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	String s3[]=s1.split(" ");
	String s4[]=s2.split(" ");
	for(int i=0;i<s3.length;i++) {
		for(int j=i+1;j<s3.length;j++) {
			if(s3[i].equals(s3[j])) {
				s3[j]="";
			}
		}
	}
	for(int i=0;i<s3.length;i++) {
		for(int j=0;j<s4.length;j++) {
			if(s3[i].equals(s4[j])) {
				System.out.println(s3[i]);
			}
		}
	}
	
	
	}

}
