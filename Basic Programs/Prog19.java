import java.util.*;
public class Prog19
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	for(int i=a;i<=b;i++){
	    int c=0;
	    for(int j=2;j<i/2;j++){
	        if(i%j==0){
	            c++;
	        }
	    }
	   if(c==0){
	       System.out.println(i);
	   }
	}
    
	 
	}
}

