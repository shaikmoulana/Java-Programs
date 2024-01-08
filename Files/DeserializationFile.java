package Files;
import java.util.*;
import java.io.*;
public class DeserializationFile {

	public static void main(String[] args) throws ClassNotFoundException {
	try {
		FileInputStream fi=new FileInputStream("/home/training/Desktop/Programs/Files/File3.txt");
		ObjectInputStream ois=new ObjectInputStream(fi);
		Student s2=(Student)ois.readObject();
		System.out.println(s2.id+" "+s2.name);
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}

}
