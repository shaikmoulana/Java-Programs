package Files;
import java.util.*;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
	File f=new File("/home/training/Desktop/Programs/Files/File1.txt");
	try {
		if(f.createNewFile()) {
			System.out.println("File1 created successfully");
		}
		else {
			System.out.println("not created");
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}

}
