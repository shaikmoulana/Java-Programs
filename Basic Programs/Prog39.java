import java.util.*;
public class Prog39
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int c=0;
	for(int i=2;i<n;i++){
	    if(n%i==0){
	        c++;
	    }
	}
	    if(c==0){
	        System.out.println("prime");
	    }
	    else{
	        System.out.println("not");
	    }
	 
	}
}

