package strings;
import java.util.*;
public class Prog1_deletechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String x=s.nextLine();
		String d=s.nextLine();
		for(int i=0;i<x.length();i++) {
			String y=String.valueOf(x.charAt(i));
			if(x.charAt(i)==d.charAt(0)) {
				continue;
			}
			System.out.print(y+" ");
		}
		
	}

}
