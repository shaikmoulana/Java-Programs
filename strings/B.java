package strings;
import java.util.*;
public class B{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
//		char c1[]=s1.toCharArray();
//		char c2[]=s2.toCharArray();
		String s3[]=s1.split(" ");
		String s4[]=s2.split(" ");
		for(int i=0;i<s3.length;i++) {
			for(int j=i+1;j<s3.length;j++) {
				if(s3[i].equals(s3[j])) {
					s3[i]="";
				}
			}
		}
		for(int i=0;i<s3.length;i++) {
			for(int j=0;j<s4.length;j++) {
				if(s3[i].equals(s4[j])) {
					System.out.println(s3[i]);
				}
			}
		}
			
		}
	
}

//		for(int i=0;i<c1.length;i++) {
//			for(int j=i+1;j<c1.length;j++) {
//				if(c1[i]==c1[j]) {
//					c1[j]='#';
//				}
//			}
//		}
//		for(int i=0;i<c2.length;i++) {
//			for(int j=i+1;j<c2.length;j++) {
//				if(c2[i]==c2[j]) {
//					c2[j]='#';
//				}			
//			}
//		}
//		
//		for(int i=0;i<c1.length;i++) {
//			for(int j=0;j<c2.length;j++) {
//				if((c1[i]==c2[j])&&(c1[i]!='#')) {
//					System.out.print(c1[i]);
//				}
//			}
//		}
//		