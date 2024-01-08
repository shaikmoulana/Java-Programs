package collections;
import java.util.*;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class evalutionque {
public static void main(String[] args) {
	LinkedHashMap<Integer,Student> hm=new LinkedHashMap<>();
	hm.put(1, (new Student(5960,"supriya")));	
	hm.put(2, (new Student(5961,"moulana")));
	hm.put(3, (new Student(5962,"jayanthi")));
	hm.put(4, (new Student(5963,"chaitanya")));

	for(Map.Entry m:hm.entrySet()) {
		Student s=(Student)m.getValue();
		System.out.println(m.getKey()+" "+s.id+" "+s.name);
	}
	 
}
}
