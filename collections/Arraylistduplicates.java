package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Arraylistduplicates {
public static void main(String[] args) throws Exception {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(1);
	Set<Integer> o=new HashSet<>();
	o.addAll(al);			
	Iterator i=o.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
