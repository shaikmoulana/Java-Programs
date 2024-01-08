package Evaluation;
import java.util.*;
import java.io.*;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}


public class practice2 {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(99,"edhokati"));
	al.add(new Student(999,"ureke"));
	al.add(new Student(9999,"picchi"));
	Iterator i=al.iterator();
	while(i.hasNext()) {
		Student o=(Student)i.next();
		System.out.println(o.id+" "+o.name);
	}
	
	HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
	hm.put(1, new Student(88,"tinnama"));
	hm.put(2, new Student(888,"padukunnama"));
	hm.put(3, new Student(8888,"tellarinda"));
	for(Map.Entry j:hm.entrySet()) {
		Student o2=(Student)j.getValue();
		System.out.println(j.getKey()+" "+o2.id+" "+o2.name);
	}

	
}
}
