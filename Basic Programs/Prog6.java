
import java.util.*;
public class Prog6
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c=s.next().charAt(0);
	if(c>='A' && c<='Z'){
	    System.out.println("Uppercase");
	}
	else if(c>='a' && c<='z'){
	    System.out.println("lower case");
	}
	else if(c>='0' && c<='9'){
	    System.out.println("digits");
	}
	else{
	    System.out.println("Special characters");
	}
	}
}

