package Evaluation;
import java.util.*;
import java.io.*;

class student implements Serializable{
	int id;
	String name;
	student(int id, String name){
		this.id=id;
		this.name=name;
	}
}

public class practice1 {
public static void main(String[] args) throws ClassNotFoundException,IOException{

//	ArrayList<student> al=new ArrayList<student>();
//	al.add(new student(101,"moulana"));
//	al.add(new student(102,"chaitu"));
//	al.add(new student(103,"sai"));
//	
//	Iterator i=al.iterator();
//	while(i.hasNext()) {
//		student ob=(student)i.next();
//		System.out.println(ob.id+" "+ob.name);
//	}
	
	HashMap<Integer,student> hm=new HashMap<Integer,student>();
	hm.put(1, new student(5960,"supriya"));
	hm.put(2, new student(5962,"jaya"));
	hm.put(3, new student(5964,"devayani"));
	for(Map.Entry i:hm.entrySet()) {
		student ob=(student)i.getValue();
		System.out.println(i.getKey()+" "+ob.id+" "+ob.name);
	}
	
	
}
}
