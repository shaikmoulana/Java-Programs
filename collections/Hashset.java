package collections;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {

		Set <String> s=new HashSet<String>();
		s.add("123");
		s.add("abc");
		s.add("123");
		s.add("abc");
		s.add("456");
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
