package strings;
import java.util.*;
public class Prog12_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String str=o.nextLine();
//		String str="moulana chay jaya";
		char ch[]=str.toCharArray();
		String s=" ";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==s.charAt(0)) {
				ch[i+1]=ch[i-1];
			}
			System.out.print(ch[i]);
		}
	}

}
