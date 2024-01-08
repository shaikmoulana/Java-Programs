package Files;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class Usingcollections {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	HashMap<Integer,Student1> al=new HashMap<>(); 
	al.put(1,new Student1(1,"moulana"));
	al.put(2,new Student1(2,"chay"));
	al.put(3,new Student1(3,"mukesh"));
	
	FileOutputStream fos=new FileOutputStream("/home/training/Desktop/Programs/Files/File3.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(al);
	fos.close();

	FileInputStream fis=new FileInputStream("/home/training/Desktop/Programs/Files/File3.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	HashMap<Integer,Student1> s2=(HashMap<Integer,Student1>)ois.readObject();
	for(Map.Entry i:s2.entrySet()) {
		Student1 ob=(Student1)i.getValue();
		System.out.println(i.getKey()+" "+ob.id+" "+ob.name);
	}
	
	fis.close();
	
}
}

class Student1 implements Serializable{
	int id;
	String name;
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
}