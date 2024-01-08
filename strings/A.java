package strings;
import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			int co=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					co++;
					c[j]='#';
				}
			}
			if(c[i]!=' ' && c[i]!='#') {
				System.out.println(c[i]+" "+co);				
			}
		}
		
	}

}

//		for(int i=0;i<c.length;i++) {
//			int count=0;
//			for(int j=0;j<c.length;j++) {
//				if(c[i]==c[j]) {
//					count++;
//				}
//			}
//			if(count==1) {
//				System.out.print(c[i]);
//			}
//		}




//		for(int i=0;i<s2.length;i++) {
//			for(int j=s2[i].length()-1;j>=0;j--) {
//				System.out.print(s2[i].charAt(j));
//			}
//			System.out.print(" ");
//			}