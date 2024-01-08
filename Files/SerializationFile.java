package Files;
import java.util.*;
import java.io.*;
public class SerializationFile {

	public static void main(String[] args) throws ClassNotFoundException {
	Scanner s=new Scanner(System.in);
	try {
		Student s1=new Student(5961,"Moulana");
		FileOutputStream fo=new FileOutputStream("/home/training/Desktop/Programs/Files/File3.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		oos.writeObject(s1);
		fo.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}
		
	try {
		FileInputStream fi=new FileInputStream("/home/training/Desktop/Programs/Files/File3.txt");
		ObjectInputStream ois=new ObjectInputStream(fi);
		Student s2=(Student)ois.readObject();
		System.out.print(s2.id+" "+s2.name);
		fi.close();
	}
	catch(IOException e){
		e.printStackTrace();
	}	
		
		
	}

}

class Student implements Serializable{ 
	transient int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
}
