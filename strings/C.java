package strings;
import java.util.*;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Moulana jaya";
		String s2="chay suppi";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		String s3="";
		for(int i=0;i<c1.length;i++) {
			for(int j=i+1;j<c1.length;j++) {
				if(c1[i]==c1[j]) {
					c1[j]='#';
				}
			}
		}
			for(int i=0;i<c2.length;i++) {
				for(int j=i+1;j<c2.length;j++) {
					if(c2[i]==c2[j]) {
						c2[j]='#';
					}
				}
			}
			for(int i=0;i<c1.length;i++) {
				for(int j=0;j<c2.length;j++) {
					if((c1[i]==c2[j]) && (c1[i]!='#')){
						System.out.print(c1[i]);	
						}
		}
			
	}
	}
}
