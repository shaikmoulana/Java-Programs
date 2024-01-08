package strings;
import java.util.*;
public class String_CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String c=s.nextLine();
		String f=s.next();
		int count=0;
		for(int i=0;i<c.length();i++) {
				if(f.charAt(0)==c.charAt(i)) {
					count++;
			}
		}
		System.out.println(count);
	}

}
