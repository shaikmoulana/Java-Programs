package strings;

public class Prog5_compareStrings {
	public static void main(String[] args) {
		String s1 = "moulu";
		String s2 = "moulu";
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					System.out.println("same String");
				} 
				else {
					System.out.println("not same String");
				}
			}
		} 
		else {
			System.out.println("not same String");
		}

//	void compare() {
//		System.out.println(s1.compareTo(s2));		
//	}
//	void assign() {
//		System.out.println(s1==s2);		
//	}
//	void equals() {
//		System.out.println(s1.equals(s2));		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	Prog5_compareStrings s=new Prog5_compareStrings();
//	s.compare();
//	s.assign();
//	s.equals();
//	}
	}

}
