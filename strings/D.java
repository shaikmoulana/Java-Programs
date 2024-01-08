package strings;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="moulana";
		String s2="chay";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
//		for(int i=0;i<c1.length;i++) {
//			for(int j=0;j<c2.length;j++) {
//				if(c1[i]!=c2[j]) {
//					System.out.print(c1[i]);
//					break;
//				}
//			}
//		}
		
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
			int c = 0;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					c++;
					break;
				}
			}
			if(c==0 && c1[i]!='#') {
				System.out.print(c1[i]);
			}
		}
		for(int i=0;i<c2.length;i++) {
			int c = 0;
			for(int j=0;j<c1.length;j++) {
				if(c2[i]==c1[j]) {
					c++;
					break;
				}
			}
			if(c==0 && c2[i]!='#') {
				System.out.print(c2[i]);
			}		}
	
	}

}
