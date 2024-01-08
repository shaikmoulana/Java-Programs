package strings;
import java.util.*;
public class Prog11_occurance{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char c[]=s1.toCharArray();
		int c1[]=new int[c.length];
		for(int i=0;i<c.length;i++) {
			c1[i]=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					c1[i]++;
					c[j]='#';
				}
			}
			if( (c[i]!=' ') && (c[i]!='#') ) {	
				System.out.println(c[i]+" "+c1[i]);
			}
			
		}
	}
}


//package strings;
//import java.util.*;
//public class Prog11_occurance {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		String s1=s.nextLine();
//		char c[]=s1.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			int oc=0;
//			for(int j=0;j<c.length;j++) {
//				if(c[i]==c[j]) {
//					oc++;
//				}
//			}
//			System.out.println(c[i]+" repeats "+oc+" times");
//		}
//	}
//
//}



