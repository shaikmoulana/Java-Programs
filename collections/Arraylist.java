package collections;
import java.util.*;
public class Arraylist {
public static void main(String[] args){
	ArrayList<String>al=new ArrayList();
	al.add("moulana");
	al.add("chay");
	al.add("mukesh");
	Iterator i=al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
