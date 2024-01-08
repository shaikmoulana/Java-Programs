package collections;
import java.util.*;
public class Hahmap {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap();
	hm.put(1,"moulana");
	hm.put(2,"chay");
	hm.put(3, "mukesh");
//	Set s=hm.entrySet();
//	Iterator i=s.iterator();
//	while(i.hasNext()) {
//		Map.Entry me=(Map.Entry)i.next();
//		System.out.println(me.getKey()+" "+me.getValue());
////		System.out.println(i.next());
//	}
	for(Map.Entry i:hm.entrySet()) {
		System.out.println(i.getKey()+" "+i.getValue());
	}
	
	
	
}
}
