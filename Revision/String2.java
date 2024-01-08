package Revision;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char c1[]=s1.toCharArray();
		for(int i=0;i<c1.length;i++) {
			int c=0;
			for(int j=0;j<c1.length;j++) {
				if(c1[i]==c1[j]) {
					c++;
				}
			}
			if(c==1) {
				System.out.print(c1[i]);
			}
		}
		
	}

}
