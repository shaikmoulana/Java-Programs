package collections;
import java.util.*;
public class L1 {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
//		System.out.println(l1);
		
		ArrayList<Integer> l2=new  ArrayList<Integer>();
		l2.add(10);
		l2.add(30);
		l2.add(50);
//		System.out.println(l2);
		
//		l1.addAll(l2);
//		l1.remove(0);
//		l1.clear();
//		l1.removeAll(l2);
//		l1.retainAll(l2);
//		l1.get(1);
//		System.out.println(l1.size());
		
		Iterator i=l1.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
}
}
