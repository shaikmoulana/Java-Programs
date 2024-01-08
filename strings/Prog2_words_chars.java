package strings;
import java.util.*;
public class Prog2_words_chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String s=o.nextLine();
		String x=" ";
		int c=1;
		for(int i=0;i<s.length();i++) {
			String s1=String.valueOf(s.charAt(i));
			if(s.charAt(i)==x.charAt(0)) {
				c++;			
			}
		}
		System.out.println(c);
		System.out.println(s.length());
	}

}
