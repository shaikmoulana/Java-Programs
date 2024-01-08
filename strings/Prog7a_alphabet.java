package strings;
import java.util.*;
public class Prog7a_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char c[]=s1.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		
	}

}

//				if(char(s1.charAt(i))> s1.charAt(j))) {
//					temp=s1.charAt(i);
//					s1.charAt(i)=s1.charAt(j);
//					s2.charAt(j)=temp;
//				}