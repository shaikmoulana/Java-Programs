package Revision;
import java.util.*;
public class String4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			for(int j=s2[i].length()-1;j>=0;j--) {
				System.out.print(s2[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
