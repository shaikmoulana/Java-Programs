package strings;
import java.util.*;
public class P02_removeCommonchars {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1="moulana chay jaya";
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			int count=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(c[i]);				
			}
		}
		
	}

}
