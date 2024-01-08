package Files;
import java.util.*;
import java.io.*;
public class ReadingFile1 {

	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("/home/training/Desktop/Programs/Files/File1.txt");
			int i;
			String s1="";
			while((i=fi.read())!=-1){
//				System.out.print((char)i);
				s1+=(char)i;
			}
			String []s2=s1.split("\n");
			System.out.println(s2.length);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
