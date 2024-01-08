package strings;

public class Prog6_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="moulana";
//		String s2=" ";
		int i=0;
		while(s1.charAt(i)!=' ') {
			i++;
		}
		
//		char d[] = s1.toCharArray();
//		for(char c: d) {
//			i++;
//		}
		System.out.println(i);
	}

}
