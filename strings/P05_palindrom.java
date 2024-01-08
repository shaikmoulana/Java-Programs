package strings;
import java.util.*;
public class P05_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String rev="";
		for(int i=0;i<s1.length();i++) {
			rev=s1.charAt(i)+rev;
		}
//		System.out.println(rev);
		
		if(s1.equals(rev)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
		
	}

}
