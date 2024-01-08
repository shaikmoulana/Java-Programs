package Files;
import java.io.*;
import java.util.*;
public class VowelsConsFiles {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		try {
		FileOutputStream fo=new FileOutputStream("/home/training/Desktop/Programs/Files/File4.txt");
		String s1=s.nextLine();
		byte b[]=s1.getBytes();
		fo.write(b);
		fo.close();
	
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
		try {
		FileInputStream fi=new FileInputStream("/home/training/Desktop/Programs/Files/File4.txt");
		int i;
		int vowels=0,consonants=0,special=0,digits=0;
		String s2="";
		while((i=fi.read())!=-1) {
			s2=s2+(char)i;
//			System.out.print(s2);
			}
		char c2[]=s2.toCharArray();
		for(int j=0;j<c2.length;j++) {
			if( (c2[j]=='A') || (c2[j]=='a') ||
					(c2[j]=='E') || (c2[j]=='e') ||
					(c2[j]=='I') || (c2[j]=='i') ||
					(c2[j]=='O') || (c2[j]=='o') ||
					(c2[j]=='U') || (c2[j]=='u') ) {
				vowels++;
			}
			else if(((c2[j]>='A') && (c2[j]<='Z' ))|| ((c2[j]>='a') && (c2[j]<='z' )))
			{
				consonants++;
			}
			else if((c2[j]>='0')&&(c2[j]<='9')) {
				digits++;
			}
			else {
				special++;
			}
			
		}
		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(digits);
		System.out.println(special);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
