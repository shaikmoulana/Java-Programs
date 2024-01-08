package collections;
import java.util.*;
public class demo {
	public static void main(String[] args) {
		String s1="welcome to miracle";
		String s2="moulana and chaitanya";
		List al1=Arrays.asList(s1.toCharArray());
		List al2=Arrays.asList(s2.toCharArray());
		al1.retainAll(al2);
		System.out.println(al1);
		
	}
	
}
