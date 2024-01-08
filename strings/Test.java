package strings;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=" ";
		char c[]=s1.toCharArray();
		String str="";
		str=str+String.valueOf(c[0]).toUpperCase();
//		System.out.print(String.valueOf(c[0]).toUpperCase());
		for(int i=1;i<c.length;i++) {
			if(c[i-1]==s2.charAt(0)) {
				str=str+String.valueOf(c[i]).toUpperCase();
			}
			else {
				
				str=str+String.valueOf(c[i]);
			}
		}
		System.out.println(str);
	}

}
