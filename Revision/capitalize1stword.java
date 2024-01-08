package Revision;

public class capitalize1stword {
	private static String str;

	public static void main(String[] args) {
		String s = "welcome to india";
		String s1[] = s.split("\\s");
		System.out.println(s);
		String capitalize = " ";
		for (String i : s1) {
			String firstl = i.substring(0, 1);
			String remaining = i.substring(1);
			capitalize = firstl.toUpperCase() + remaining;
			StringBuffer sb=new StringBuffer(capitalize); 
			System.out.print(sb.reverse()+" ");
		}		
	}
}