package strings;
import java.util.*;
public class charCountForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);{
		String c=s.nextLine();
		for(int i=0;i<c.length();i++) {
			int count=1;
			for(int j=i+1;j<c.length();j++) {
				if(c.charAt(i)==c.charAt(j)) {
					count++;
				}
			}
			System.out.println(c.charAt(i)+" "+count);
		}
		}
	}

}
