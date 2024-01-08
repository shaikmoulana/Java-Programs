package Files;
import java.util.*;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) {
	try {
		FileInputStream fi=new FileInputStream("/home/training/Desktop/Programs/Files/File2.txt");
		int i;
		while((i=fi.read())!=-1) {
			System.out.print((char)i);	
		}
		
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	
	}
}
