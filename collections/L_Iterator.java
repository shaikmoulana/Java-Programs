package collections;
import java.util.*;
public class L_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> l1=new ArrayList<String>();
		l1.add("Moulana");
		l1.add("Chaitanya");
		l1.add("Jay");
		l1.add("Suppi");
		l1.add("Moulana");
		
		ListIterator i=l1.listIterator(2);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
