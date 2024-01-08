package Revision;

public class Pract {

	public static void main(String[] args) {
	String s1="hi moulana";
	String s2=" ";
	int co=1;
	char c[]=s1.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(c[i]==s2.charAt(0)) {
			co++;
			continue;
		}
	}
	System.out.println(co);
	System.out.println(c.length);
	}

}
