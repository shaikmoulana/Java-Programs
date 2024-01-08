package Files;
import java.util.*;
import java.io.*;
public class WriteFile {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try {
		FileOutputStream fo=new FileOutputStream("/home/training/Desktop/Programs/Files/File2.txt",true);
//		String s1="File2 is created";
		String s1=s.nextLine();
		byte b[]=s1.getBytes();
		fo.write(b);
		fo.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}

}
