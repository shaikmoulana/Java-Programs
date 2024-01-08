import java.util.*;
public class Prog8
{
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	
	if(x==y){
	    System.out.println("equal");
	}
	if(x>y){
	    System.out.println(x+" is greater");
	}
	else{
	    System.out.println(y+" is greater");
	}
	
	
	}
}

