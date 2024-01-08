package Files;
import java.io.*;
public class evaluationque {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("File5.txt");
	String s1="hello miracle 123";
	byte b[]=s1.getBytes();
	fos.write(b);
	fos.close();
	System.out.println("written");
	
	FileInputStream fis=new FileInputStream("File5.txt");
	int i;
	String s2="";
	while((i=fis.read())!=-1) {
		s2=s2+(char)i;
		System.out.print((char)i);
	}
	System.out.println();
	int vow=0,con=0,digits=0;
	char c[]=s2.toCharArray();
	for(int j=0;j<c.length;j++) {
		if( (c[j]=='a')|| (c[j]=='A') ||
	    	(c[j]=='e')|| (c[j]=='E') ||	
	   		(c[j]=='i')|| (c[j]=='I') ||
	    	(c[j]=='o')|| (c[j]=='O') ||
	    	(c[j]=='u')|| (c[j]=='U') ) {
			vow++;
		}
		else if((c[j]>='A')&&(c[j]<='Z') || (c[j]>='a')&&(c[j]<='z')) {
			con++;
		}
		else if((c[j]>='0')&&(c[j]<='9') ) {
			digits++;
		}
		
	}
	System.out.println("vowels "+vow);
	System.out.println("consonants "+con);
	System.out.println("digits "+ digits);
	
}
}
