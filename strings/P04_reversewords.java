package strings;
import java.util.*;
public class P04_reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="moulana chaitanya";
		String[] s2=s1.split(" ");
//		System.out.println(s2[0]);
		for(int i=0;i<s2.length;i++) {
			for(int j=s2[i].length()-1;j>=0;j--) {
				System.out.print(s2[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
