package collections;
import java.util.*;
public class Mapcollect {

	public static void main(String[] args) {
	HashMap m=new HashMap();
	m.put(1,"moulana");
	m.put(2, "chaitanya");
	m.put(3, "Supriya");
	
	Set s=m.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		Map.Entry me=(Map.Entry)i.next();
		System.out.println(me.getKey()+ " "+ me.getValue());
		
	}
	
	}

}
