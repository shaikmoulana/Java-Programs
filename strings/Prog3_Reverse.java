package strings;
import java.util.*;
public class Prog3_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String s=o.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i)+" ");
		}
	}

}
