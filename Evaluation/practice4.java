package Evaluation;

import java.io.*;
import java.util.*;

public class practice4 {
class Student implements Serializable{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class SerDesUsingCollection {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<>();
	al.add(new Student(5960,"supriya"));	
	al.add(new Student(5961,"moulana"));
	al.add(new Student(5962,"jayanthi"));
	al.add(new Student(5963,"chaitanya"));
	
	try {
		FileOutputStream fo=new FileOutputStream("/home/miracle/eclipse-workspace/Programs/File101.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		oos.writeObject(al);
		fo.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
		
	try {
		FileInputStream fi=new FileInputStream("/home/miracle/eclipse-workspace/Programs/File101.txt");
		ObjectInputStream ois=new ObjectInputStream(fi);
		ArrayList<Student> ob2=(ArrayList<Student>)ois.readObject();
//		Iterator i=ob2.iterator();
//		while(i.hasNext()) {
//			Student ob3=(Student)i.next();
//			System.out.println(ob3.id+" "+ob3.name);
//		}
		
		for(Student i:ob2) {
			System.out.println(i.id+" "+i.name);
		}
	
		
		fi.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}	
}
